import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] a = new int [100];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		int sw = 0;
		boolean flag = true;
		for(int i = 0; flag; i++) {
			flag = false;
			for (int j = N - 1; j >= i+1; j--) {
				if(a[j] < a[j-1]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					flag = true;
					sw++;
				}
			}
		}
		
		for (int i1 = 0; i1 < N - 1; i1++) {
			System.out.print(a[i1] + " ");
		}
		System.out.println(a[N-1]);
		System.out.println(sw);
	}

}

