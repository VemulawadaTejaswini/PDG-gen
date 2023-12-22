import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    static String br = System.getProperty("line.separator");
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        int N = nextInt();
        int[] A = new int[N];
        int[] B = new int[N -1];
        for(int i=0; i<N - 1; i++){
            B[i] = nextInt();
        }

        int Answer = B[0];
        A[0] = B[0];

        for(int i=1; i<N - 1; i++){
            if (B[i] > B[i - 1]) {
            	A[i] = B[i - 1];
            } else {
            	A[i] = B[i];
            }
            Answer += A[i];
        }

        if (N > 1) {
            Answer += B[N - 2];
        }

        println(Answer);
    }

    static int nextInt() {
        return Integer.parseInt(next());
    }

    static Long nextLong() {
        return Long.parseLong(next());
    }

    static String next() {
        return sc.next();
    }

    static String nextLine(){
        return sc.nextLine();
    }

    static void println(Object o) {
        out.println(o);
        out.flush();
    }

    static void print(Object o) {
        PrintWriter out = new PrintWriter(System.out);
        out.print(o);
        out.flush();
    }
}