import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		final Scanner sc = new Scanner(System.in);
		
		while(true){
			final int Y = sc.nextInt();
			final int Q = sc.nextInt();
			
			if(Y == 0 && Q == 0){
				break;
			}
			
			String names[] = new String[Y];
			int[] dec = new int[Y];
			int[] years = new int[Y];
			
			for(int i = 0; i < Y; i++){
				names[i] = sc.next();
				dec[i] = sc.nextInt();
				years[i] = sc.nextInt();
			}
			
			for(int i = 0; i < Q; i++){
				final int y = sc.nextInt();
				
				boolean found = false;
				int pos = -1;
				for(int j = 0; j < Y; j++){
					if((years[j] - dec[j]) < y && y <= years[j]){
						pos = j;
						found = true;
						break;
					}
				}
				
				if(!found){
					System.out.println("Unknown");
				}else{
					System.out.println(names[pos] + " " + (y - (years[pos] - dec[pos])));
				}
			}
		}
		
		
	}

}