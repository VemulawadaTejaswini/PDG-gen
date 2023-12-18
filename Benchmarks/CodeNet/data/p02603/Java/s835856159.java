import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		int start =1000;
		for (int i=0;i<N;i++) {
			int now = i;
			while (now<N-1&&A[now+1]<=A[now]) {
				now++;
			}
			if (now==N-1) {
				break;
			}
			int buy = start /A[now];
			start = start - buy*A[now];
			while (now<N-1&&A[now+1]>A[now]) {
				now++;
			}
			start += buy*A[now];
			i = now+1;
		}
		System.out.println(start);
	}
}