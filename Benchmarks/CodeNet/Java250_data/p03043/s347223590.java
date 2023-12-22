import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner $ = new Scanner(System.in);
		int N = $.nextInt(), K = $.nextInt();
		double sum = 0.0;
		for (int i = 0; i < N; i++){
			double p = 1.0;
			for (int M = 1; M * (i + 1) < K; M *= 2){
				p *= 1.0 / 2.0;
			}
			sum += p;
			//System.out.println(p);
		}
		System.out.println(sum / N);
		/*
		3 10 -> 0.145833333333
		100000 5 -> 0.999973749998
		*/
	}
}
