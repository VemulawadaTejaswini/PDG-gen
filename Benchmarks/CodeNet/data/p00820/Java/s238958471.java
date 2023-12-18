import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 2 << 15;
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; ; i++){
			final int s = i * i;
			if(s > MAX){
				break;
			}
			
			list.add(s);
		}
		
		final int size = list.size();
		int[] count = new int[MAX+1];
		
		for(int i = 0; i < size; i++){
			final int v1 = list.get(i);
			count[v1]++;
			
			for(int j = i; j < size; j++){
				final int v2 = v1 + list.get(j);
				
				if(v2 > MAX){
					break;
				}
				
				count[v2]++;
				
				for(int k = j; k < size; k++){
					final int v3 = v2 + list.get(k);
					
					if(v3 > MAX){
						break;
					}
					
					count[v3]++;
					
					for(int l = k; l < size; l++){
						final int v4 = v3 + list.get(l);
						
						if(v4 > MAX){
							break;
						}
						
						count[v4]++;
					}
				}
			}
		}
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			System.out.println(count[n]);
			
		}
	}

}