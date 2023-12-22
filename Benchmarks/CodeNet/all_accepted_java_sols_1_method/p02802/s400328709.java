import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[] = new int[N];
		int penality = 0;
		for (int i=0;i<M;i++) {
			int temp = sc.nextInt();
			String result = sc.next();
			if (result.equals("WA")) {
				if (a[temp-1]<=0) {
					a[temp-1]--;
				}
			} else {
				if (a[temp-1]<0) {
					penality +=-a[temp-1];
				}
				a[temp-1]=1;
			}
		}
		int correct=0;
		for (int i=0;i<N;i++) {
			if (a[i]>0) {
				correct++;
			}
		}
		System.out.println(correct+" "+penality);
	}
}
