import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int count = 0;

		for (int i = 1; i <= n ;i++){
			a[i]  = sc.nextInt();
		}

		int wk = 0;
		for (int i = 1; i <= n ;i++){

			wk = a[i];

			if(a[wk] == i){
				count++;
			}
		}



		System.out.println(count/2);
		sc.close();
	}
}
