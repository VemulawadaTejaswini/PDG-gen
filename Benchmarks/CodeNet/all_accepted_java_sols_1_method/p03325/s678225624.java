import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; ++i) {
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i = 0; i < N; ++i) {
			int count = 0;
			
			while(a[i] % 2 == 0) {
				count++;
				a[i] /= 2;
			}
			
			sum += count;
		}
		
		System.out.println(sum);
	}
}