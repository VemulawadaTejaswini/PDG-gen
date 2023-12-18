import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.BigInteger;

/**
 * @author yoshikyoto
 */
class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean[] visited = new boolean[60];
		int time = 0;
		
		while(!visited[time % 60]) {
			visited[time % 60] = true;
			int start = time % 60;
			time += a;
			int end = time % 60;
			// System.out.println(start + " " + end);
			int d = (time % 60 - c + 60) % 60;
			if(start < end){
				if(start <= c && c <= end) {
					System.out.println(time - d);
					return;
				}
			}else{
				if(c <= end || start <= c) {
					System.out.println(time - d);
					return;
				}
			}
			time += b;
		}
		System.out.println(-1);
	}
}