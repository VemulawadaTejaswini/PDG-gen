import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final String input = sc.next();
			
			if("0.0".equals(input)){
				break;
			}
			
			final double error = Double.parseDouble(input);
			
			final double upper_bound = Math.PI + error;
			final double lower_bound = Math.PI - error;
			
			for(int denom = 1; ; denom++){
				int lower = (int)(Math.ceil(lower_bound * denom));
				int upper = (int) (upper_bound * denom);
				
				final double denom_d = (double) denom;
				
				final double low_d = lower / denom_d;
				final double high_d = upper / denom_d;
				
				//System.out.println(denom + " " + low_d + " " + high_d);
				
				if(upper_bound >= low_d && low_d >= lower_bound){
					System.out.println(lower + "/" + denom);
					break;
				}else if(upper_bound >= high_d && high_d >= upper_bound){
					System.out.println(upper + "/" + denom);
					break;
				}
			}
			
		}
		
		sc.close();
	}

}