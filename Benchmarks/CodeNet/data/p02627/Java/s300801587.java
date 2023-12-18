import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = sc.next();
		if (s.toUpperCase() == s) {
			System.out.println('A');
		} else {
			System.out.println('a');
		}
	}
}