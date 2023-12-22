import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int []a = new int [5];
		int []b = new int [5];
		int max = 0;
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
			b[i] = (10 - (a[i] % 10))%10;
			max = Math.max(max, b[i]);
 		}
		for(int j = 0; j < 5; j++) {
			sum += a[j] + b[j] ;
		}
		
		System.out.println(sum - max);
	}

}
