import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();

		for (int i=0; i<20; i++) {
			if (x > 105*i && x < 100*(i+1)) {
				System.out.println("0");
				System.exit(0);
			}
		}
		System.out.println(1);
	}
}