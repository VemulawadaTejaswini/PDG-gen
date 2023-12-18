import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			String str = sc.next();
			int flag=0;
			for(int a=0;flag==0;a++) {
				if(a%2==0 || a%13==0 || a%26==0) continue;
				String ans = "";
				for(int b=0;flag==0;b++) {
					for(int j=0;j<str.length();j++) {
						char c = str.charAt(j);
						if('a'<=c && c<='z') {
							int f = (a*(c-'a')+b)%26;
							ans += letters[f];
						}else {
							ans += c;
						}
					}
					if(ans.indexOf("that")!=-1 || ans.indexOf("this")!=-1) {
						flag=1;
						System.out.println(ans);
					}
				}
			}
			
		}
	}
}

