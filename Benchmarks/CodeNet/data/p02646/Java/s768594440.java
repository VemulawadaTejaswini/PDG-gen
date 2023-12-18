import java.util.*;
public class Main{

	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
			long a  = sc.nextLong();
			long v   = sc.nextLong();
			long b = sc.nextLong();
			long w = sc.nextLong();
			long t = sc.nextLong();
			long relspeed = v - w;
			if(relspeed <= 0 || (a > b && relspeed <= 0)){
				System.out.println("NO");
			}else{
				long diff = b - a;
				long ans = (diff/relspeed) + (diff%relspeed==0 ? 0 : 1);
				if(ans <= t) System.out.println("YES");
				else System.out.println("NO");
			}
	}
}