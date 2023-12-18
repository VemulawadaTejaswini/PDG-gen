
import java.util.*;


public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		int ans=0;
		
		for(int i=0;i<s.length();i++) {
			int k= Character.getNumericValue(s.charAt(i));
			ans+=k;
			ans%=9;
		}
		if(ans==0)System.out.println("Yes");
		else System.out.println("No");

	

	
	}
}
