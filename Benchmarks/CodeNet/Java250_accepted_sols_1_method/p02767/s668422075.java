import java.util.Scanner;
import java.lang.Math;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
		}
		int ave = 0;
		for(int data: x){
			ave += data;
		}
		ave = (int)Math.rint((double)ave / n);
		int sum = 0;
		for(int data: x){
			sum += Math.pow((data - ave), 2);
		}
		System.out.println(sum);

	}
}
