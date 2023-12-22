import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		double sum_max = 0;
		double sum_tmp = 0;
		int index_max_start = 0;
		double[] p = new double[N];


		for(int i=0;i<K;i++){
			p[i] = sc.nextDouble();
			sum_tmp += p[i];
		}
		
		sum_max = sum_tmp;
		
		for(int i=K;i<N;i++){
			
			p[i] = sc.nextDouble();
			sum_tmp = sum_tmp + p[i] - p[i-K];
			
			if(sum_tmp > sum_max){
				sum_max = sum_tmp;
				index_max_start = i - K + 1;
			}
		}
		
		double ans = 0;
		for(int i=index_max_start;i<index_max_start+K;i++){
			ans += ((double)p[i] + 1.000000000000) / 2.000000000000;
		}
		
		System.out.printf("%.12f",ans);

	}
}