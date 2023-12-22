import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static final int MAX = 300000;
	public static final int S_MAX = (int) (Math.ceil(Math.sqrt(MAX)));
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		boolean[] is_16prime = new boolean[MAX + 1];
		
		for(int i = 2; i <= MAX; i++){
			is_16prime[i] = (i % 7 == 1 || i % 7 == 6);
		}
		
		for(int i = 6; i <= S_MAX; i++){
			if(is_16prime[i]){
				for(int j = 2 * i; j <= MAX; j += i){
					is_16prime[j] = false;
				}
			}
		}
		
		ArrayList<Integer> p_list = new ArrayList<Integer>(); 
		for(int i = 0; i <= MAX; i++){
			if(is_16prime[i]){
				p_list.add(i);
			}
		}
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 1){
				break;
			}
			
			System.out.print(n + ":");
			
			for(int i = 0; i < p_list.size(); i++){
				final int tmp = p_list.get(i);
				
				if(tmp > n){
					break;
				}
				
				if(n % tmp == 0){
					System.out.print(" " + tmp);
				}
			}
			
			System.out.println();
		}
	}

}