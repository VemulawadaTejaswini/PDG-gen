import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		
		final String input = sc.next();
		
		String[] in = input.split("iwi");
		
		StringBuilder sb = new StringBuilder(in[0]);
		
		char[] in1 = sb.reverse().toString().toCharArray();
		char[] in2 = in[1].toCharArray();
		
		for(int i = 0; i < in1.length; i++){
			switch(in1[i]){
			case '{':
				in1[i] = '}';
				break;
			case '}':
				in1[i] = '{';
				break;
			case '(':
				in1[i] = ')';
				break;
			case ')':
				in1[i] = '(';
				break;
			case '[':
				in1[i] = ']';
				break;
			case ']':
				in1[i] = '[';
				break;
			}
		}
		
		int[][] DP = new int[in1.length][in2.length];
		
		for(int i = 0; i < in1.length; i++){
			for(int j = 0; j < in2.length; j++){
				if(i == 0 && j == 0){
					DP[i][j] = in1[i] == in2[j] ? 1 : 0;
				}else if(i == 0){
					DP[i][j] = Math.max(DP[i][j - 1], in1[i] == in2[j] ? 1 : 0);
				}else if(j == 0){
					DP[i][j] = Math.max(DP[i - 1][j], in1[i] == in2[j] ? 1 : 0);
				}else{
					DP[i][j] = Math.max(DP[i-1][j-1] + (in1[i] == in2[j] ? 1 : 0) ,Math.max(DP[i][j-1], DP[i-1][j]));
				}
				
				//System.out.print(DP[i][j] + " ");
			}
			//System.out.println();
		}
		
		System.out.println((3 + 2 * DP[in1.length - 1][in2.length - 1]));
		
		//System.out.println(Arrays.toString(in1) + " " + Arrays.toString(in2));
	}

}