import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
		if (s.equals("ARC")) {
			System.out.println("ABC");
		} else if (s.equals("ABC")) {
			System.out.println("ARC");
		}
	}
}