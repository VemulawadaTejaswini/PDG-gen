import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
    
    
public class Main {
	static int INF = 2 << 27;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			if(r == 0 && c == 0) break;
			System.out.println((r * c)%2 == 0?"yes":"no");
		}
	}
}