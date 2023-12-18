import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		char[] pur = sc.next().toCharArray();
		
		int count = 0;
		for(int i = 0; i < N; i++){
			char[] input = sc.next().toCharArray();
			
			boolean flag = false;
			
			SUC:
			for(int j = 0; j < input.length; j++){
				if(input[j] != pur[0]){
					continue;
				}
				
				LOOP:
				for(int k = 0; j + (k + 1) * (pur.length - 1) < input.length; k++){
					
					for(int pos = 1; pos < pur.length; pos++){
						if(input[j + pos * (k + 1)] != pur[pos]){
							continue LOOP;
						}
					}
					
					flag = true;
					break SUC;
				}
			}
			

			if(flag){
				count++;
			}
		}
		
		
		System.out.println(count);
	}

}