import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			char[] s = sc.next().toCharArray();
			HashSet<Character> hset1 = new HashSet<Character>();
			HashSet<Character> hset2 = new HashSet<Character>();
			HashSet<Integer> ret = new HashSet<Integer>();
			int num =0;
			for(int i=0;i<n;i++) {
				num=0;
				for(int j=0;j<=i;j++) {
					hset1.add(s[j]);
					
				}
				
				for(int k=i+1;k<n;k++) {
					
					hset2.add(s[k]);
					
				}
				
				for(char a:hset1) {
					if(hset2.contains(a)) {
						num++;
					}
				}
				ret.add(num);
				hset1.clear();
				hset2.clear();
			}
			
			System.out.println(Collections.max(ret));
			
		}	
	}