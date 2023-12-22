
import java.io.*;
 
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char b = sc.next().charAt(0);
		String msg = "";

		if (b == 'A')  {
			msg = "T";
		} else if (b == 'T') {
			msg = "A";
		} else if (b == 'C') {
			msg = "G";
		} else {
			msg = "C";
		}
		System.out.println(msg);
	}
}