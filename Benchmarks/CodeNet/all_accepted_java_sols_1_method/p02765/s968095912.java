import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int N = sc.nextInt(), R = sc.nextInt();
		if(N >= 10) {
			pw.print(R);
		}else {
			pw.print(100*(10-N)+R);
		}
		pw.close();
	}
}
