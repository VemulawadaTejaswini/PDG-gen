import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int d[] = new int[N];
        for (int i=0; i<N; i++) {
            d[i] = Integer.parseInt(sc.next());
        }
        sc.close();

        long sum = 0L;

        for (int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                sum += d[i] * d[j];
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(sum);
        out.flush();
    }
}