import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int buf;
		for(int i = 0; i < n; i++)
			x[i] = sc.nextInt();
		for(int i = 0; i < n - 1; i++){
			for(int j = i + 1; j < n; j++){
				if(x[i] > x[j]){
					buf = x[i];
					x[i] = x[j];
					x[j] = buf;
				}
			}
		}
		for(int i = 0; i < n; i++)
			System.out.printf("%d ", x[i]);
		System.out.printf("\b\n");
	}
???