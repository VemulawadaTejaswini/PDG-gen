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
			execute17_1();
		}
		
		private static void execute17_2() {
			try 
			(Scanner sc = new Scanner(System.in)) {
				int n = sc.nextInt();
				
				if(n%2==0) {
					System.out.println(-1);
				} else {
					long a=0;
				}
			}
			
		}
		
		private static void execute17_1() {
			try 
			(Scanner sc = new Scanner(System.in)) {
				int n = sc.nextInt();
				String str = sc.next();
				
				char[] c = new char[n];
				
				int red=0;
				int white=0;
				for(int i=0; i<n;i++) {
					c[i] = str.charAt(i);
					if(c[i]=='R') {
						red++;
					} else {
						white++;
					}
				}
				
				long ans=0;
				for(int i=0; i<n-1;i++) {
					if(red>=i+1 && c[i]=='W') {
						ans++;
					}
					
				}
				
				System.out.println(ans);
			}
		}
    }