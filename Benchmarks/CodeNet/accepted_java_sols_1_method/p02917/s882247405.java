import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int count = 0;
	int[] suuti = new int[N-1];
	for(int i = 0; i<suuti.length;i++) {
		suuti[i] = sc.nextInt();
	}
	for(int i = 0; i<suuti.length; i++) {
		count += i == 0? suuti[i]:Math.min(suuti[i-1],suuti[i]);
	}
	count += suuti[suuti.length-1];
	System.out.println(count);
	}
}
