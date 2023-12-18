import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		String str = String.format("%32s", Long.toBinaryString(x)).replace(' ', '0');
		System.out.println(str.substring(str.length() - 32, str.length()));
		str = String.format("%32s", Long.toBinaryString(~x)).replace(' ', '0').substring(32, 64);
		System.out.println(str.substring(str.length() - 32, str.length()));
		str = String.format("%32s", Long.toBinaryString(x << 1)).replace(' ', '0');
		System.out.println(str.substring(str.length() - 32, str.length()));
		str = String.format("%32s", Long.toBinaryString(x >> 1)).replace(' ', '0');
		System.out.println(str.substring(str.length() - 32, str.length()));
	}
}

