import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int remainder = in.nextInt()%1000;
		if (remainder == 0)
			System.out.println("0");
		else
			System.out.println(1000 - remainder);
	}
}

