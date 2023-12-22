	import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
	
	public class Main {
	
		public static void main(String[] args) {
			execute16_3();
		}
		
		private static void execute16_3() {
			try 
			(Scanner sc = new Scanner(System.in)) {
				String s = sc.next();
				String t = sc.next();
			
			int ans=0;
			
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)!=t.charAt(i)) {
					ans++;
				}
			}
			System.out.println(ans);
			}
			
		}
    }