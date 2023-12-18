import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			long upper = N, lower = 0;
			
			while(lower + 1 < upper){
				final long MAX = (lower + upper) / 2;
				
				long rest = N - MAX;
				for(long use = MAX - 1; use >= 1; use--){
					if(rest >= use){ rest -= use; }
				}
				
				//System.out.println(MAX + " " + rest);
				
				if(rest > 0){
					lower = MAX;
				}else{
					upper = MAX;
				}
			}
			
			System.out.println(upper);
			long rest = N - (upper);
			for(long use = upper - 1; use >= 1; use--){
				if(rest >= use){ 
					rest -= use;
					System.out.println(use);
				}
			}
		}
	}
	
	
}
