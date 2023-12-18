import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
 class Main {
		public static void main(String[]args) {
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();			
			HashMap<String,Integer> hmap = new HashMap<>();
			
			for(int i = 0 ; i< n ; i++) {
				char[] c = scan.next().toCharArray();
				Arrays.sort(c);
				String s = String.valueOf(c);
				 
				if(hmap.containsKey(s)) {
					hmap.put(s, hmap.get(s)+1);
				}else {
					hmap.put(s,1);
				}
			}
			long count = 0 ;
			for(int a : hmap.values()) {
				count += (long)a*(a-1)/2 ;
			}
			System.out.println(count) ;
		}
}