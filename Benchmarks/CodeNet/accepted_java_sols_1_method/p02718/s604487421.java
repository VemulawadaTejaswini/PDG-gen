import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
			int num = sc.nextInt();
			x[i] = num;
			sum += num;
		}
		double limit = (double) sum / (double)(m * 4);

		int count = 0;
		for(int i = 0; i < n; i++){
			if(x[i] >= limit)count++;
		}
		System.out.println((count >= m)?"Yes":"No");
	}
}