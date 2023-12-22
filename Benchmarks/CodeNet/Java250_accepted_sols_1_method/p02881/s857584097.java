import java.util.Scanner;
import java.lang.Math;

public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		sc.close();
		long intn = (long)n;
		long t = (long)Math.sqrt(n);
		long ans = Long.MAX_VALUE;
		for(int i = 1;i <= t;i++){
				if(intn%i == 0){
					long tmp = intn/i;
					long ans_ = i + tmp - 2;
					if(ans_ < ans){
					ans = ans_;
				}
			}
		}
		System.out.println(ans);
	}
}