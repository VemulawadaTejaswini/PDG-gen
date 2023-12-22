import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		String s = sc.next();
//		int n = sc.nextInt();
		double n = sc.nextDouble();
		double k = sc.nextDouble();

		double cnt = 0;
		while(true) {
			if(n < Math.pow(k,cnt)) {
				System.out.println((int)cnt);
				break;
			}
			cnt++;
		}

	}
}
