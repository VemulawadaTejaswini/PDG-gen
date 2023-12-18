import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		long sum = 1;
		long max = (long) Math.pow(10, 18);

		if( count >= 2) {
		for(int i = 0 ; i < count ; i++) {
			long value = scan.nextLong();
			sum *= value;
			}
		}
		scan.close();
		if(sum <= max) System.out.println(sum);
		else System.out.println(-1);
	}
}
