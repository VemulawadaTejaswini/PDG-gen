import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count =0;
		int A[] = new int[200000];
		for (int i=0;i<N;i++) {
			int temp = sc.nextInt();
			if (temp>N) {
				count ++;
			} else {
				A[temp]++;
			}
		}
		for (int i=0;i<A.length;i++) {
			if (A[i]>i) {
				count +=A[i]-i;
			} else if (A[i]<i) {
				count +=A[i];
			}
		}
		System.out.println(count);
	}
}