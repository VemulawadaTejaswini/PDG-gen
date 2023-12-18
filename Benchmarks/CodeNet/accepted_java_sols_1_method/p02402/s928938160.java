import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N+1];
		
		a[0] = sc.nextInt();

		int max = a[0];
		int min = a[0];
		long sum = a[0];
		
		for(int i = 1; i < N; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
			
			if(max < a[i]) {
				max = a[i];
			}if(min > a[i]) {
				min = a[i];
			}
			
		}
		
		System.out.printf("%d %d %d\n",min,max,sum);

	}

}

