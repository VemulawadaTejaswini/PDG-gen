import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double ans = 0.0;
		for(int i=0;i<N;++i){
			double x = sc.nextDouble();
			String u = sc.next();
			if(u.equals("JPY")) ans += x;
			else ans += x*380000.0;
		}
		System.out.println(ans);
		return;
	}
}