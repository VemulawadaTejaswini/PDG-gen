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
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int start = -1;
			int before = -1;
			StringBuilder be = new StringBuilder();
			for(int i = 0; i < n; i++){
				int in = sc.nextInt();
				
				if(i == n - 1){
					if(before + 1 == in){
						before = in;
					}
					
					if(be.length() != 0){
						be.append(" ");
					}
					
					if(before != in){
						be.append(start + " " + before);
					}else{
						be.append(start + "-" + before);
					}
				}else if(start == -1){
					start = in;
					before = in;
				}else if(before + 1 == in) {
					before = in;
				}else {
					if(be.length() != 0){
						be.append(" ");
					}
					be.append(start == before ? start : start + "-" + before);
					start = in;
					before = in;
				}
			}
			
			
			
			System.out.println(be);
		
		}
	}

}