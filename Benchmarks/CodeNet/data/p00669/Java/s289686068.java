import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static long get_max(final int n, int[] array, final int k){
		long cur = 1;
		for(int i = 0; i < k; i++){
			cur *= array[i];
		}
		
		long max = cur;
		for(int i = k; i < n; i++){
			cur /= array[i - k];
			cur *= array[i];
			
			max = Math.max(max, cur);
		}
		
		return max;
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int k = sc.nextInt();
			
			if(n == 0 && k == 0){
				break;
			}
			
			int[] array = new int[n];
			for(int i = 0; i < n; i++){
				array[i] = sc.nextInt();
			}
			
			long def_max = get_max(n, array, k);
			long new_max = 0;
			
			for(int i = 0; i < n; i++){
				for(int j = i + 1; j < n; j++){
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
					
					new_max = Math.max(new_max, get_max(n, array, k));
					
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
			
			if(def_max > new_max){
				System.out.println("NO GAME");
			}else{
				System.out.println(new_max - def_max);
			}
		}
	}

}