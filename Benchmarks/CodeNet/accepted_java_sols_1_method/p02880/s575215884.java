import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		HashSet<Integer> set = new HashSet<>();
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				set.add(i*j);
			}
		}
		if(set.contains(N)) {
			out.println("Yes");
		}
		else {
			out.println("No");
		}

		out.flush();
	}
}