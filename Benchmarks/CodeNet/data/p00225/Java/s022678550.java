import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static int MAX = 10000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] start = new int[26];
			int[] end = new int[26];
			
			for(int i = 0; i < n; i++){
				char[] in = sc.next().toCharArray();
				
				start[in[0] - 'a']++;
				end[in[in.length-1] - 'a']++;
			}
			
			boolean flag = true;
			for(int i = 0; i < 26; i++){
				if(start[i] != end[i]){
					flag = false;
					break;
				}
			}
			
			if(flag){
				System.out.println("OK");
			}else{
				System.out.println("NG");
			}
		}
	}

}