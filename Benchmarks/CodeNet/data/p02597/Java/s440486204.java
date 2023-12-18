import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int r=0;
			int c=0;
			String s = sc.next();
			for(int i=0;i<n;i++)
			{
				if(s.charAt(i)!='R' && r==0) c++;
				if(s.charAt(i) == 'R') r++;
			}
			if(r==n) System.out.println("0");
			else if(r<=c) System.out.println(r);
			else System.out.println(r-1);
	}
}
