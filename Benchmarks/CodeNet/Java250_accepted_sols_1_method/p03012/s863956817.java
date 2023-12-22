import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int w[] = new int[N]; 
		for(int i=0;i<N;i++){
			w[i] = sc.nextInt();
		}
		int ans = 100000000;
		for(int i=0;i<N;i++){
			int sum1 = 0;
			int sum2 = 0;
			for(int j=0;j<i;j++){
				sum1 += w[j];
			}
			for(int k=i;k<N;k++){
				sum2 += w[k];
			}
			ans = Math.min(ans, (int)Math.abs(sum1-sum2));
		}
		System.out.println(ans);
	}
}