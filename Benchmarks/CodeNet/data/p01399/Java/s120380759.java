import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static int require_time(int min_time, int min_difficult, int actual_difficult, final int n, final int nth){
		final int ret_time = (min_time / actual_difficult) * actual_difficult;
		
		if(min_time == ret_time && min_difficult < actual_difficult){
			if(min_difficult < actual_difficult){
				return ret_time;
			}else if(min_difficult == actual_difficult && nth < n){
				return ret_time;
			}else{
				return ret_time + actual_difficult;
			}
		}else{
			return ret_time + actual_difficult;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			int[] inputs = new int[n];
			for(int i = 0; i < n; i++){
				inputs[i] = sc.nextInt();
			}
			
			int min_time = (m / inputs[0]) * inputs[0];
			int min_difficult = inputs[0];
			int report_num = 1;
			
			for(int i = 1; i < n; i++){
				final int actual_difficult = inputs[i];
				final int require_time = require_time(min_time, min_difficult, actual_difficult, n, i + 1);
				
				final int actual_time = (require_time > m) ? ((m / actual_difficult) * actual_difficult) : require_time;
				//System.out.println("> (" + actual_time + " " + actual_difficult + ") " + min_time + " " + min_difficult + " "  + report_num);
				if(actual_time < min_time){
					min_time = actual_time;
					min_difficult = actual_difficult;
					report_num = i + 1;
				}else if(actual_time == min_time && actual_difficult < min_difficult){
					min_difficult = actual_difficult;
					report_num = i + 1;
				}else if(actual_time == min_time && actual_difficult == min_difficult){
					report_num = n;
				}
				
				//System.out.println(">> (" + actual_time + " " + actual_difficult + ") " + min_time + " " + min_difficult + " "  + report_num);
			}
			
			System.out.println(report_num);
			
		}
		
	}

}