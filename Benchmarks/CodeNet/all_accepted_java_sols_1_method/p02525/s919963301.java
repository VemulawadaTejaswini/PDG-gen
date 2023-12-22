import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int[] score = new int[n];
			int sum = 0;
			for(int i = 0; i < n; i++){ 
				score[i] = sc.nextInt();
				sum += score[i];
			}
			double ave = 1.0 * sum / n;
			double ans = 0;
			for(int i = 0; i < n; i++){
				ans += (score[i] - ave) * (score[i] - ave);
			}
			System.out.println(Math.sqrt(1.0 * ans / n));
		}
	}
}