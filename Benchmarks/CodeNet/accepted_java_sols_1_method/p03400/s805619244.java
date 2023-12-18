import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		int[] cons = new int[D + 1];
		for (int element : input) {
			int today = 1;
			while (today <= D) {
				cons[today]++;
				today += element;
			}
		}
		long sum = 0;
		for (int con : cons) {
			sum += con;
		}
		System.out.println(sum + X);
	}
}
