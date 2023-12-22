import java.util.*;
import java.io.*;
public class Main{
	static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;
	public static void main(String[] args) throws IOException{
	    br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new OutputStreamWriter(System.out));
        int A = readInt(), B = readInt(), C = readInt(), X = readInt(), Y = readInt();
        int op1 = A*X + B*Y;
        int min = Math.min(X, Y);
        int op2 = min*C*2 + A*(X-min) + B*(Y-min);
        int op3 = Math.max(X,Y)*C*2;
        int Best = Math.min(Math.min(op1, op2), op3);
        System.out.println(Best);
	}
	static String next () throws IOException {
	    while (st == null || !st.hasMoreTokens())
	    st = new StringTokenizer(br.readLine().trim());
	    return st.nextToken();
	}

	static long readLong () throws IOException {
	    return Long.parseLong(next());
	}

	static int readInt () throws IOException {
	    return Integer.parseInt(next());
	}

	static double readDouble () throws IOException {
	    return Double.parseDouble(next());
	}

	static char readCharacter () throws IOException {
	    return next().charAt(0);
	}

	static String readLine () throws IOException {
	    return br.readLine().trim();
	}
}

