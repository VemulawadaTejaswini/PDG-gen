import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<Integer>(); 
		Scanner sc = new Scanner(System.in);
		while(true){
			int point =0;
			int n = sc.nextInt();
			int[] score = new int[n];
			if(n==0){
				break;
			}
			
			for(int i=0;i<n;i++){
			score[i] = sc.nextInt();
			}
			Arrays.sort(score);
			for(int i=1;i<n-1;i++){
				point += score[i];
			}
			result.add(point/(n-2));
		}
		for(int i=0;i<result.size();i++){
			System.out.println(result.get(i));
		}
	}
}