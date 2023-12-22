
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

//submit change class name to Main and at main method also correct class name
public class Main {
    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable t) {
            t.printStackTrace(System.err);
            System.exit(-1);
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    void solve() throws IOException {
        int n = readInt();
        int k = readInt();
        int[] all = new int[n];
        int[] res = new int[n];
        for(int i=0;i<n;i++)
            all[i]=readInt();
        res[0]=0;
        for(int i=1;i<n;i++){
            res[i] = Integer.MAX_VALUE;
            for(int j=i-1;j >= Math.max(0, i-k);j--) {
                int cost = Math.abs(all[i]-all[j]) + res[j];
                if(cost<res[i])
                    res[i]=cost;
            }
        }
        System.out.println(res[n-1]);
    }
}
