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
		
		while(true){
			final int k = sc.nextInt();
			
			if(k == 0){
				break;
			}
			
			int sum = 0;
			for(int i = 0; i < (k *(k - 1))/2; i++){
				sum += sc.nextInt();
			}
			
			System.out.println(k == 1 ? sum : sum / (k - 1));
		
		}
	}

}