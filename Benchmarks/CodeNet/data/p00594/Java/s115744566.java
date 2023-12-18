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
			int[] list = new int[n];
			for(int i = 0; i < n; i++) {
				list[i] = sc.nextInt();
			}
			Arrays.sort(list);
			int now = list[0];
			int count = 0;
			boolean ok = false;
			for(int i = 0; i < n; i++) {
				if(now != list[i]) {
					count = 1;
					now = list[i];
				}
				else {
					count++;
					if(count > n/2) {
						System.out.println(list[i]);
						ok = true;
						break;
					}
				}
			}
			if(!ok) {
				System.out.println("NO COLOR");
			}
		}
	}
 }