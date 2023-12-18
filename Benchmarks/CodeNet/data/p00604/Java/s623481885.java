import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			final int n = sc.nextInt();
			
			int sum = 0;
			int pre = 0;
			
			int[] array = new int[n];
			for(int i = 0; i < n; i++){
				array[i] = sc.nextInt();
			}
			
			Arrays.sort(array);
			
			for(int i = 0; i < n; i++){
				sum += pre + array[i];
				pre += array[i];
			}
			
			System.out.println(sum);
		
		}
	}

}