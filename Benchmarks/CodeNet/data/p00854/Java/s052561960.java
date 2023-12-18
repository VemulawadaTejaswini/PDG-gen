import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {

			final int n = sc.nextInt();
			final int k = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && k == 0 && m == 0){
				break;
			}
			
			int[] array = new int[n];
			for(int i = 0; i < n; i++){
				array[i] = i+1;
			}
			
			array[m-1] = -1;
			
			int cur = m - 1;
			
			for(int i = 0; i < n - 2; i++){
				for(int j = 0; j < k; j++){
					cur = (cur + 1) % n;
					
					if(array[cur] == -1){
						j--;
					}
				}
				
				array[cur] = -1;
			}
			
			for(int i : array){
				if(i != -1){
					System.out.println(i);
					break;
				}
			}
			
		}
	}

}