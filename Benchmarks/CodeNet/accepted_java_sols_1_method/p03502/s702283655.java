

import java.util.*;
 //AtCoder problemsに反映されないため再提出
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int NN = N;
		int fx = 0;
		while (N > 0) {
			fx += N % 10;
			N /= 10;
		}
		System.out.println(NN % fx == 0 ? "Yes" : "No");
	}
}