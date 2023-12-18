
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		while(sc.hasNextLine()){
			int n = sc.nextInt();
			int[] score = new int[n];
			for(int i=0; i<n; i++){ score[i] = sc.nextInt(); }

			int max = score[0];
			int min = score[0];
			for(int i=0; i<n; i++){
				if(max <= score[i]){ max = score[i]; }
				if(min >= score[i]){ min = score[i]; }
			}

			int average = 0;
			for(int i=0; i<n; i++){ average += score[i]; }
			average = (average - max - min) / (n - 2);
			System.out.println(average);
		}
	}
}