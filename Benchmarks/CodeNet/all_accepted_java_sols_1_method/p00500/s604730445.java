import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int[] score = new int[n];
		int[][] scan = new int[n][];
		for(int i=0;i<n;i++){
			scan[i] = new int[3];
			for(int j=0;j<3;j++){
				scan[i][j] = stdIn.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			int[] input = new int[n];
			for(int j=0;j<n;j++){
				input[j] = scan[j][i];
				if(map.containsKey(input[j])){
					int value = map.get(input[j]);
					map.put(input[j], ++value);
				}
				else{
					map.put(input[j], 1);
				}
			}
			for(int j=0;j<n;j++){
				if(map.get(input[j])==1){
					score[j] += input[j];
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(score[i]);
		}
	}
}