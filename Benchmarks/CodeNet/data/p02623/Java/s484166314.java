import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long K = sc.nextLong();
		long A []=  new long[(int)N];
		long B[] = new long[(int)M];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		for (int i=0;i<M;i++) {
			B[i] = sc.nextLong();
		}
		long sum =0;
		long a=0;
		long b =0;
		long count =0;
		while (sum<=K) {
			if (a<N&&b<M) {
				if (A[(int)a]<B[(int)b]) {
					if (A[(int)a]+sum<=K) {
						count++;
						sum +=A[(int)a];
						a++;
					} else {
						break;
					}
				} else {
					if (B[(int)b]+sum<=K) {
						count++;
						sum +=B[(int)b];
						b++;
					} else {
						break;
					}
				}
			} else if (a==N&&b==M) {
				break;
			} else if (a==N) {
				if (B[(int)b]+sum<=K) {
					count++;
					sum +=B[(int)b];
					b++;
				} else {
					break;
				}
			} else {
				if (A[(int)a]+sum<=K) {
					count++;
					sum +=A[(int)a];
					a++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}
}