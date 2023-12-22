import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] a = new int[N];
		int[] b = new int[N];
		int count = 0;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			int x = a[i];
			count = 0;
			for(int j = 0; j < x; j++) {
				if(a[i] % 2 == 0) {
					count++;
					a[i] /= 2;
				} else {
					b[i] = count;
					break;
				}
			}
			sum += count;
		}
		System.out.println(sum);	
	}
}
