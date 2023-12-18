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
			execute16_4();
		}
		
		private static void execute16_4() {
			try 
			(Scanner sc = new Scanner(System.in)) {
				int s = sc.nextInt();
				System.out.println(s+s*s+s*s*s);
			}
		}
    }