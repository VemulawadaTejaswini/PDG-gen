import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int a[] = new int[n];
			int t=0;
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				t+=a[i];
			}
			int min=1<<30;
			for (int i = 0; i < 10; i++) {
				int s=0;
				for (int j = 0; j < n+1; j++) {
					if((1<<j&(i+1))>0){
						s+=a[j];
					}
				}
				min = Math.min(min, Math.abs(t-s-s));
			}
			System.out.println(min);
		}
	}
}