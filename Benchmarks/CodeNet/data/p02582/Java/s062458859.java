
import java.util.*;


public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c1=s.charAt(0);char c2=s.charAt(1);char c3=s.charAt(2);
		
		int ans=0;
		
		if(c1=='R') {
			if(c2!='R')ans=1;
			else {
				if(c3!='R')ans=2;
				else ans=3;
			}
		}else if(c2=='R') {
			if(c3=='R')ans=2;
			else ans=1;
		}else {
			if(c3=='R')ans=1;
		}
		
		
		System.out.println(ans);

	}

	
}
