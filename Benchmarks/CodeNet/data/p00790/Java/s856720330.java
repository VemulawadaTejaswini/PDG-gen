import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int top = 1;
			int north = 2;
			int west = 3;
			
			for(int i = 0; i < n; i++){
				String input = sc.next();
				
				if("north".equals(input)){
					int next_top = 7 - north;
					int next_north = top;
					
					top = next_top;
					north = next_north;
				}else if("south".equals(input)){
					int next_top = north;
					int next_north = 7 - top;
					
					top = next_top;
					north = next_north;
				}else if("east".equals(input)){
					int next_top = west;
					int next_west = 7 - top;
					
					top = next_top;
					west = next_west;
				}else if("west".equals(input)){
					int next_top = 7- west;
					int next_west = top;
					
					top = next_top;
					west = next_west;
				}
			}
			
			System.out.println(top);
		}
	}

}