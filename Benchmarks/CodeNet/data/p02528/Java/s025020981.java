import java.util.Scanner;

public class sort1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[];
		a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++){
			for(int j = 1; j < n-i; j++){
				if(a[j-1] > a[j]){
					int c = a[j];
					a[j] = a[j-1];
					a[j-1] = c;
				}
			}
		}
		for(int i = 0; i < n; i++){
			System.out.printf("%d ", a[i]);
		}
	}
}