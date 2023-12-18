import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 24 * 60 * 60;
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] imos = new int[MAX];
			
			for(int i = 0; i < n; i++){
				String[] start_str = sc.next().split(":");
				final int start = (Integer.parseInt(start_str[0]) * 60 + Integer.parseInt(start_str[1])) * 60 + Integer.parseInt(start_str[2]);
				
				String[] end_str = sc.next().split(":");
				final int end = (Integer.parseInt(end_str[0]) * 60 + Integer.parseInt(end_str[1])) * 60 + Integer.parseInt(end_str[2]);
				
				imos[start]++;
				if(end < MAX){
					imos[end]--;
				}
			}
			
			int max = 0;
			for(int i = 1; i < MAX; i++){
				imos[i] += imos[i-1];
				max = Math.max(max, imos[i]);
			}
			
			System.out.println(max);
		}
	}

}