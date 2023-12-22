import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] x = new int[N];
		for(int i = 0;i < N;i ++) {
			x[i] = sc.nextInt();
		}
		int center = K / 2, sum = 0;;
		for(int i = 0;i < N;i ++) {
			if(x[i] <= center) {
				sum += x[i] * 2;
			}else {
				sum += (K - x[i]) * 2;
			}
		}
		System.out.println(sum);
	}

}