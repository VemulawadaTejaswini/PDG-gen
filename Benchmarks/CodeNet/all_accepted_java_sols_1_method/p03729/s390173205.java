import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner in = new Scanner(file);
		
		Scanner in = new Scanner(System.in);
		
		String A = in.next();
		String B = in.next();
		String C = in.next();
		System.out.println((A.charAt(A.length()-1) == B.charAt(0) && B.charAt(B.length()-1) == C.charAt(0)) ? "YES" : "NO");
	}
}
