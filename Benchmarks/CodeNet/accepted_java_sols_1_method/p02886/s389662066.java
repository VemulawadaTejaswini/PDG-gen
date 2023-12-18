import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] d = new int[N];
		int i = 0;
		while (true) {
			d[i] = sc.nextInt();
			i++;
			if (i >= N) {
				break;
			}
		}
		int sum = 0;
		for (i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				sum += d[i] * d[j];
			}
		}
		System.out.println(sum);
	}

}
