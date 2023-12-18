import java.util.Scanner;

public class Main {
	static int gcd(int a, int b) {
		if(a<b) {
			return gcd(b, a);
		}
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=sc.nextInt();
			for(int i=0; i<n; i++) {
				String str=sc.nextLine();
				String ans="";
				
				for(int a=1; a<10000; a++) {
					if(gcd(a, 26)==1) {
						for(int b=0; b<26; b++) {
							for(int j=0; j<str.length(); j++) {
								int num=str.charAt(i)-'a';
								if(num>=0 && num<26) {
									ans += (char)((a*num+b)%26 + 'a');
								}
								else {
									ans += (char)(num+'a');
								}
							}
						}
						if(ans.contains("that") || ans.contains("this")) {
							break;
						}
						ans = "";
					}
				}
				System.out.println(ans);
				
				
			}
			
			
		}
	}
}
