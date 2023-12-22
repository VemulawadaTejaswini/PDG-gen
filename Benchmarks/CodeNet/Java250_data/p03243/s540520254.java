import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	private static BufferedReader br = null;
	
	public static void main(String[] args) {
		String n = read(1)[0];
		
		char x1 = n.charAt(2);
		for (int i = 1; i >= 0; i--) {
			if (x1 > n.charAt(i)) {
				x1 = (char)(n.charAt(i) + 1);
			} else {
				x1 = n.charAt(i);
			}
		}
		
		System.out.println("" + x1 + x1 + x1);
	}
	
	private static String[] read(int len) {
		List<String> strList = new ArrayList<>();
		
		try {
			if (br == null) {
				br = new BufferedReader(new InputStreamReader(System.in));
			}
			
			for (int i = 0; i < len; i++) {
				strList.add(br.readLine());
			}
		} catch (IOException e) {
		}
		
		return strList.toArray(new String[0]);
	}
	
	private static void close() {
		try {
			if (br != null) {
				br.close();
			}
		} catch (IOException e) {
		}
	}
}
