import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	
	public static int solve(char[] str, int start, int end){
		final boolean is_number = !(str[start + 1] == '[' || str[start + 1] == ']');
		/*
		for(int pos = start; pos < end; pos++){
			System.out.print(str[pos]);
		}
		System.out.println();
		*/
		if(is_number){
			int num = 0;
			for(int pos = start + 1; pos < end - 1; pos++){
				num *= 10;
				num += str[pos] - '0';
			}
			
			return num / 2 + 1;
		}else{
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			
			int depth = 0;
			int d_start = -1;
			
			for(int pos = start; pos < end; pos++){
				if(str[pos] == '['){
					if(depth == 1){
						d_start = pos;
					}
					
					depth++;
				}else if(str[pos] == ']'){				
					depth--;
					
					if(depth == 1){
						final int ret = solve(str, d_start, pos + 1);
						
						list.add(ret);
					}
				}
			}
			
			Collections.sort(list);
			//System.out.println(list);
			
			int size = list.size() / 2 + 1;
			int ret = 0;
			for(int i = 0; i < size; i++){
				ret += list.get(i);
			}
			
			return ret;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		
		
		for(int tt = 0; tt < n; tt++){
			final char[] input = sc.next().toCharArray();
			
			
			
			System.out.println(solve(input, 0, input.length));
			
		}
		
	}

}