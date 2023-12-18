import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long y = in.nextLong();
		int s = 1;
		while(true) {
			x *= 2;
			if(x <= y) s++;
			else break;
		}
		System.out.println(s);
	}
}