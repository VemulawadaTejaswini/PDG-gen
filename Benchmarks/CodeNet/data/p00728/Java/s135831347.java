import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0 ) break;
			int[] score = new int[n];
			for(int i = 0 ; i < n ; i++){
				score[i] = sc.nextInt();
			}
			Arrays.sort(score);
			score[0] = 0; score[n-1] = 0;
			int sum = 0 ; int count = 0;
			for(int i = 0 ; i < n ;i++){
				if(score[i] != 0) count++;
				sum += score[i];
			}
			System.out.println(sum/count);
		}
		sc.close();
	}

}