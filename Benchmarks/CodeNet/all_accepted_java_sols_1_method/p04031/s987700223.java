import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = scan.nextInt();
		}

		int[] cost = new int[201];
		int k = 0;
		for(int i = -100; i <= 100; i++){
			for(int j = 0; j < n; j++){
				cost[k] += (a[j] - i) * (a[j] - i);
			}
			k ++;
		}

		int min = cost[0];
		for(int i = 1; i < 201; i++){
			if(cost[i] < min){
				min = cost[i];
			}
		}
		System.out.println(min);
	}
}
