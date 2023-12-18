import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int [] ans = new int [20];
	Arrays.fill(ans, -1);
	int j = 0;
	while(true) {
		int n = sc.nextInt();
		if(n == 0){
			break;
		}
		int[] score = new int[n];
		int max_score = 0, min_score = 1000;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
			sum += score[i] / n;
			if(max_score <= score[i]){
				max_score = score[i];
			}else if(min_score >= score[i]){
				min_score = score[i];
			}
		}
		ans[j] = (sum - max_score  - min_score) / (n - 2);
		j++;
	}
	for(int i = 0; ans[i] != -1; i++){
		System.out.println(ans[i]);
		}
	}
}
