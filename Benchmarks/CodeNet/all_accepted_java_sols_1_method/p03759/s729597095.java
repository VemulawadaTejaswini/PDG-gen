import java.util.*;
import java.io.*;
import java.lang.*;
import static java.lang.System.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int[] poles = new int[3];
		for (int i = 0; i < 3; i++) {
			poles[i] = sc.nextInt();
		}
		String isBeautiful = "NO";
		if (poles[1]-poles[0] == poles[2] - poles[1]) {
			isBeautiful = "YES";
		}
		out.println(isBeautiful);
	}
}