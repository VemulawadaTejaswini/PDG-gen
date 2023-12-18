import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		long x = Math.abs(sc.nextLong());
		long k = sc.nextLong();
		long d = sc.nextLong();
		long ans = 0;
		long temp = x / d;
		if(x < (k * d)) {
			ans = Math.abs(x - d*temp - d*((k-temp)%2));
		}else {
			ans = x - (k * d);
		}

		
		System.out.println(ans);
	}
	
}

