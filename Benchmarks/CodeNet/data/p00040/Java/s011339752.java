import java.util.Scanner;

public class Main {
	
	static int gcd(int a, int b) {
		if(b>a) {
			return gcd(b, a);
		}
		if(b==0) {
			return a;
		}
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n=Integer.parseInt(sc.nextLine());
			
			for(int i=0; i<n; i++) {
				char[] str=sc.nextLine().toCharArray();
				for(int j=0; j<str.length; j++) {
					str[j] -='a';
				}
				
				String ans="";
				
				for(int a=1; ans.equals(""); a++) {
					if(gcd(a, 26)==1) {
						for(int b=0; b<26; b++) {
							for(int j=0; j<str.length; j++) {
								if(str[j]>=0 && str[j]<26) {
									ans += (char)((a*str[j]+b)%26 + 'a');
								}
								else {
									ans += (char)(str[j]+'a');
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
