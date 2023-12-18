import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	String INPUT = "";
	
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(new ByteArrayInputStream(INPUT.getBytes()));
		PrintWriter out = new PrintWriter(System.out);
		
		solve(sc, out);
		out.flush();
	}
	
	void solve(Scanner sc, PrintWriter out) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int arr[] = {a,b,c};
		Arrays.sort(arr);
		
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
	}
}

