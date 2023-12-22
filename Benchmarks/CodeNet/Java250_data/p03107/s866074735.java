import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskC   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        String S = in.next();

        int c0 = 0;
        int c1 = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) - '0' == 0){
                c0++;
            } else {
                c1++;
            }
        }
        out.println(2 * Math.min(c0, c1));
    }
}
}

