import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String S=sc.next();
		String ans="";
		
		for(int i=0;i<S.length();i++) {
			
			if(S.charAt(i)=='0')
				ans+="0";
			if(S.charAt(i)=='1')
				ans+="1";
			if(S.charAt(i)=='B') {
				if(ans.length()>0)
					ans=ans.substring(0,ans.length()-1);
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}