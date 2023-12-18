import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		
		//iより左に、西を向いている人が何人いるか
		int[] westCount = new int[n];
		//iより右に、東を向いている人が何人いるか
		int[] eastCount = new int[n];
		
		for(int i = 1; i < n; i++){
			if(input.charAt(i - 1) == 'W'){
				westCount[i] = westCount[i - 1] + 1;
			}
			else {
				westCount[i] = westCount[i - 1];
			}
			
			if(input.charAt(n - i) == 'E'){
				eastCount[n - i - 1] = eastCount[n - i] + 1; 
			}
			else {
				eastCount[n - i - 1] = eastCount[n - i];
			}
		}
		
		int result = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++){
			int tmp = westCount[i] + eastCount[i];
			
			result = Math.min(tmp, result);
		}
		
		//debug
//		for(int i = 0; i < n; i++){
//			System.out.print(westCount[i] + " ");
//		}
//		
//		System.out.println();
//
//		for(int i = 0; i < n; i++){
//			System.out.print(eastCount[i] + " ");
//		}
//		
//		System.out.println();

		System.out.println(result);
		
	}

}
