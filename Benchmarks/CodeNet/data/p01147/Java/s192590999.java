import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int size;
	public static String ans;
	
	public static void dfs(int deep, final int N, String[] array, boolean[] used, LinkedList<String> stack){
		if(deep < N){
			for(int i = 0; i < N; i++){
				if(used[i]){
					continue;
				}
				
				used[i] = true;;
				stack.addLast(array[i]);
				
				dfs(deep + 1, N, array, used, stack);
				
				stack.removeLast();
				used[i] = false;
			}
		}else{
			StringBuilder sb = new StringBuilder();
			
			for(String str : stack){
				final int sb_size = sb.length();
				final int st_size = str.length();
				
				if(sb.indexOf(str) >= 0){
					continue;
				}
				
				
				final int len = Math.min(sb_size, st_size);
				
				int max = 0;
				LOOP:
				for(int l = 1; l <= len; l++){
					for(int c = l - 1; c >= 0; c--){
						if(sb.charAt(sb_size - 1 - c) != str.charAt(l - c - 1)){
							continue LOOP;
						}
					}
					
					max = l;
				}
				
				if(max != 0){
					sb.delete(sb_size - max, sb_size);
				}
				
				sb.append(str);
			}
			
			String sb_str = sb.toString();
			
			if(ans == null){
				ans = sb_str;
			}else if(sb_str.length() < ans.length()){
				ans = sb_str;
			}else if(sb_str.length() == ans.length() && sb_str.compareTo(ans) < 0){
				ans = sb_str;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}

			String[] array = new String[N];
			for (int i = 0; i < N; i++) {
				array[i] = sc.next();
			}

			ans = null;
			
			dfs(0, N, array, new boolean[N], new LinkedList<String>());
			
			System.out.println(ans);
			
		}

		sc.close();
	}

}