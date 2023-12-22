import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String NN = keyboard.next();
			int N = Integer.parseInt(NN);
			
		int[] yama = new int[N];
			for(int i=0; i < N; i++) {
				yama[i] = keyboard.nextInt();
			}
			
		int count = 1;
		
		int max = yama[0];
		int min = 0;
		
		if (N > 1) {
			min = yama[1];
		}
		
		for (int j = 1; j < N; j++) {
		    int height = yama[j];
		    if ( height >= max) {
		        max = height;
		        count ++;
		        continue;
		    }else {
		    	if (height < min) {
		    		min = height;
		    		continue;
		    	}
		    }
		}
			System.out.print(count);

		keyboard.close();	
	}
}