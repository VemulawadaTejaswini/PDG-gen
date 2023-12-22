import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int not10min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if(a % 10 != 0) {
				not10min = Math.min(not10min, a);
			}
			max += a;
		}
		if(max % 10 != 0) {
			System.out.println(max);
		} else if(not10min!=Integer.MAX_VALUE){
			System.out.println(max-not10min);
		} else {
			System.out.println(0);
		}
	}
}