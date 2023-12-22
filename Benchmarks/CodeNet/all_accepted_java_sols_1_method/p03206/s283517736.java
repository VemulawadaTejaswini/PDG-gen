import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String ans = "Christmas";
		int b = 25; 
		while(b != a) {
			ans += " Eve ";
			b--;
		}
		System.out.println(ans);
	}
}