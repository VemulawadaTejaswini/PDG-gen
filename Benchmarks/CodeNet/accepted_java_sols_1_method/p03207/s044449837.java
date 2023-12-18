import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		int max = 0;
		int total = 0;
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
			max = Math.max(max, p[i]);
			total += p[i];
		}
		total = total - max + max / 2;
		System.out.println(total);
	}

}
