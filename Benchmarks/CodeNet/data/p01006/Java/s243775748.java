import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
   
   
public class Main {
	static int INF = 2 << 29;
	static int[][] ok = {{1,3},{0,2,4},{1,5},{0,4,6},{1,3,5,7},{2,4,8},{3,7},{4,6,8},{5,7}};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 1000; i++) {
			char[] in = sc.next().toCharArray();
			boolean ans = true;
			for(int j = 1; j < in.length; j++) {
				if(Arrays.binarySearch(ok[in[j-1] - 'A'],in[j] - 'A') < 0) {
					ans = false;
					break;
				}
			}
			if(ans) {
				System.out.println(String.valueOf(in));
			}
		}
		
	}
	
}