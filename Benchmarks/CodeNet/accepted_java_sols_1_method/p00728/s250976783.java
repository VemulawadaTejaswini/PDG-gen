import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int[] score = new int[n];
			for(int i = 0;i < n;i++){
				score[i] = scan.nextInt();
			}
			Arrays.sort(score);
			int sum = 0;
			for(int i = 1;i < n-1;i++){
				sum += score[i];
			}
			System.out.println(sum/(n-2));
		}
	}
}