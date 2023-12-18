import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int sum = 0;
			int max = -1000000;
			int n = sc.nextInt();
			if( n == 0) break;
			int[] a = new int[n];
			for(int i = 0; i < n ; i++){
				a[i] = sc.nextInt();
			}
			for(int i = 0;i < n ; i++){
					sum = 0;
				for(int j = i ; j < n ; j++){
					sum += a[j];
					if(sum >= max){
						max = sum;
					}
				}
			}
			System.out.println(max);
		}
	}
}