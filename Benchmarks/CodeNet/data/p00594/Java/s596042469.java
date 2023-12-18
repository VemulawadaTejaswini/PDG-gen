import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
 			ArrayList<Integer> list = new ArrayList<Integer>();
			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int i = 0; i < n; i++) {
				int in = sc.nextInt();
				if(map.containsKey(in)) {
					map.put(in, map.get(in)+1);
				}
				else {
					list.add(in);
					map.put(in,1);
				}
			}
			boolean ok = true;
			for(int i = 0; i < list.size(); i++) {
				if(map.get(list.get(i)) > n/2) {
					System.out.println(list.get(i));
					ok = false;
					break;
				}
			}
			if(ok) {
				System.out.println("NO COLOR");
			}
			
		}
	}
 }