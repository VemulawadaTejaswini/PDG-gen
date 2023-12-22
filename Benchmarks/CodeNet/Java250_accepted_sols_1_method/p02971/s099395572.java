import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        final int N = Integer.parseInt(sc.next());
        int[] ar = new int[N];
        int[] br = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(sc.next());
            br[i] = ar[i];
        }
        
        Arrays.sort(br);

        for (int i = 0; i < N; i++) {
            out.println(ar[i] == br[N-1] ? br[N-2] : br[N-1]);
        }
        
        out.flush();
    }
}