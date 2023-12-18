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
		
		final int m = sc.nextInt();
		
		for(int i = 0; i < m; i++){
			final int money = sc.nextInt();
			final int year = sc.nextInt();
			final int kind = sc.nextInt();
		
			int max = Integer.MIN_VALUE;
			
			for(int j = 0; j < kind; j++){
				final int type = sc.nextInt();
				final double per = sc.nextDouble();
				final int tax = sc.nextInt();
				
				int mo = money;
				
				if(type == 0){
					int p = 0;
					
					for(int k = 0; k < year; k++){
						p += mo * per;
						mo -= tax;
					}
					
					mo += p;
				}else{
					
					for(int k = 0; k < year; k++){
						int p = (int)(mo * per);
						mo += p - tax;
					}
					
				}
				
				max = Math.max(max, mo);
			}
			
			System.out.println(max);
		}
		
	}

}