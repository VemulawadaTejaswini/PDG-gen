import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int Alice = 0;
		int Bob = 0;
		int n = sc.nextInt();
		int []a = new int [n ];
		
		for (int i = 0; i < n  ; i++) {
			a[i] = sc.nextInt();	
		}
		 Arrays.sort(a);
		 if (n % 2 == 0)
		for(int i = 1 ; i <= n/2 ; i++) {
			Alice += a[n - ( 2 * i - 1)];
			Bob += a[n - (2 * i) ];					
		}
		 if (n % 2 == 1) {
		for(int i = 1; i <= (n - 1)/2; i++) {
			Alice += a[n - (2 * i - 1)];
			Bob += a[n - (i * 2)];					
		}
		    Alice += a[0];
		 }
		 
		System.out.println((Alice - Bob));
		
	}
			
	}


