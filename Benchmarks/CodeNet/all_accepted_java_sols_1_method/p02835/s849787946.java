import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int a3 = in.nextInt();
		if (a1+a2+a3 < 22)
			System.out.println("win");
		else
			System.out.println("bust");
	}
}

