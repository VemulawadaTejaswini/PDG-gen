import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int h[] = new int[N];
		for (int i=0;i<N;i++) {
			h[i]= sc.nextInt();
		}
		int result[]= new int[N];
		for (int i=0;i<M;i++) {
			int a= sc.nextInt();
			int b = sc.nextInt();
			if (h[a-1]<h[b-1]) {
				result[a-1]++;
			} else if (h[a-1]==h[b-1]) {
				result[a-1]++;
				result[b-1]++;
			} else {
				result[b-1]++;
			}
		}
		int count=0;
		for (int i=0;i<N;i++) {
			if (result[i] ==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}