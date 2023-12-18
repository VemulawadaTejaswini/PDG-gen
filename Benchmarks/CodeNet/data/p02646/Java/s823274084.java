import java.util.*;
public class Main{

	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
			long a  = sc.nextLong();
			long v   = sc.nextLong();
			long b = sc.nextLong();
			long w = sc.nextLong();
			long t = sc.nextLong();
			int count=1;
			while(count <= t){
				if(a==b) break;
				a += v;
				b += w; count++;
			}
			if(a==b && count <= t)System.out.println("YES");
			else System.out.println("NO");
	}
}