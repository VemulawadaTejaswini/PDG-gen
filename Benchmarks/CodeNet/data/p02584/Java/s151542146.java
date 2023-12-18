import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		long x = Math.abs(sc.nextLong());
		long k = sc.nextLong();
		long d = sc.nextLong();
		long ans = 0;
		long move = x / d;
		if(x < (k * d)) {
			ans = x - d*move;
			if((k-move)%2==1) {
				ans-=d;
			}
		}else {
			ans = x - (k * d);
		}

		
		System.out.println(Math.abs(ans));
	}
	
}

