import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 1000000;
	public static int[] count = new int[MAX];
	
	public static int[] array = new int[6];
	public static int s_len = -1;
	public static int s_max = Integer.MIN_VALUE;
	
	public static int dps(int target, String in, int sum, LinkedList<Integer> list){
		//System.out.println(list);
		
		if("".equals(in)){
			if(target >= sum){
				count[sum]++;
				
				if(s_max < sum){
					int count = 0;
					for(int k : list){
						array[count] = k;
						count++;
					}
					s_len = list.size();
					
					s_max = sum;
				}
				
				return sum;
			}else{
				return Integer.MIN_VALUE;
			}
		}else{
			int max = Integer.MIN_VALUE;
			
			for(int i = 1; i <= in.length(); i++){
				final int t = Integer.parseInt(in.substring(0, i));
				
				if(sum + t <= target){
					list.addLast(t);
					max = Math.max(max, dps(target, in.substring(i), sum + t, list));
					
					list.removeLast();
				}
			}
			
			return max;
		}
	}
	
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		
		while(true){
			final int t = sc.nextInt();
			final String in = sc.next();
			
			if(t == 0 && "0".equals(in)){
				break;
			}
			
			Arrays.fill(count, 0);
			s_len = -1;
			s_max = Integer.MIN_VALUE;
			Arrays.fill(array, Integer.MIN_VALUE);
			
			int result = dps(t, in, 0, new LinkedList<Integer>());
			
			if(result == Integer.MIN_VALUE){
				System.out.println("error");
			}else if(count[result] > 1){
				System.out.println("rejected");
			}else{
				System.out.print(result);
				for(int i = 0; i < s_len; i++){
					System.out.print(" " + array[i]);
				}
				System.out.println();
			}
			
		}
	}

}