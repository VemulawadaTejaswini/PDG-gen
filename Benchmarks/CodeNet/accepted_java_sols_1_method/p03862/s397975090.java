import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] a = new int[N];

		for(int i = 0 ; i < N ; i++){
			a[i] = sc.nextInt();
		}

		sc.close();
/*
		for(int i = 0 ; i < N ; i++){
			System.out.println(a[i]);
		}
*/
		long count = 0;
		for(int i = 0 ; i < N-1 ; i++){
			if(a[i]+a[i+1]>X){
				count += (a[i]+a[i+1])-X;

				if( (a[i]+a[i+1])-X <= a[i+1]){
					a[i+1] = X-a[i];
				}
				else{
					a[i] = a[i]-(X-a[i+1]);
					a[i+1] = 0;
				}
			}
		}
		System.out.println(count);
	}
}
