import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Main {
    public static boolean solve(int[] a, int i, int m) {
        if(m == 0) {
            return true;
        }
        
        if(i >= a.length) {
            return false;
        }
        
        return solve(a, i + 1, m) || solve(a, i + 1, m - a[i]);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int q = Integer.parseInt(br.readLine());
        int[] m = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i < q; i++) {
            if(solve(a, 0, m[i])) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}