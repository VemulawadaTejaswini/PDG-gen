import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n = 0;
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			return;
		}
		
		System.out.println(n > 999 ? "ABD" : "ABC");
	}
}
