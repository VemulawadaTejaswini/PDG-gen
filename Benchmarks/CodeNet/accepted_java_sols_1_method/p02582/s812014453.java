
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
		String s=sc.next();
		char a[]=s.toCharArray();
		int count=0;
		if(a[0]=='R'&&a[1]=='R'&&a[2]=='R') {
			count=3;
		}else if(a[0]=='R'&&a[1]=='R') {
			count=2;
		}else if(a[1]=='R'&&a[2]=='R') {
			count=2;
		}else if(a[0]=='R'||a[1]=='R'||a[2]=='R') {
			count=1;
		}else {
			count=0;
		}
				System.out.println(count);		
			
	}
	   
}
