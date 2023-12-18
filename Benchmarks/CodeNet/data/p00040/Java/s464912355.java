import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static char [] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	static void ab(String str,String ans) {
		for(int a=0;;a++) {
			if(a%2==0 || a%13==0 || a%26==0) continue;
			for(int b=0;b<26;b++) {
				if(check(change(str,ans,a,b))) {
					System.out.println(ans);
					return;
				}
			}
		}
	}
	
	static String change(String str,String ans,int a,int b) {
		for(int j=0;j<str.length();j++) {
			char c = str.charAt(j);
			if('a'<=c && c<='z') {
				int x = Arrays.binarySearch(letters, c);
				int f = (a*x+b)%26;
				ans += letters[f];
			}else {
				ans += c;
			}
		}
		return ans;
	}
	
	static boolean check(String ans) {
		if(ans.indexOf("that")!=-1 || ans.indexOf("this")!=-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				String str = sc.next();
				String ans = "";
				ab(str,ans);
			}
		}
		
	}
}

