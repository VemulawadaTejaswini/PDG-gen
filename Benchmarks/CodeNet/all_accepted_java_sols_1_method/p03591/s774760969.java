import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		String s = f.readLine();
		if(s.startsWith("YAKI")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
