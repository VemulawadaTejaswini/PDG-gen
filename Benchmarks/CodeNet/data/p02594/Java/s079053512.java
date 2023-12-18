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
			execute17_4();
		}
		
		private static void execute17_4() {
			try 
			(Scanner sc = new Scanner(System.in)) {
				int n = sc.nextInt();
				
				if(n<30) {
					System.out.println("No");
				} else {
					System.out.println("Yes");
				}
			}
			
		}
    }