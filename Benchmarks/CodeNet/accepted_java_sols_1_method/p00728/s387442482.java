import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			int[] score = new int[n];
			
			for(int i = 0; i < n; i++){
				score[i] = Integer.parseInt(br.readLine());
			}
			
			Arrays.sort(score);
			
			int sum = 0;
			for(int i = 1; i < n - 1; i++){
				sum += score[i];
			}
			
			System.out.println(sum/(n - 2));
		}
	}

}