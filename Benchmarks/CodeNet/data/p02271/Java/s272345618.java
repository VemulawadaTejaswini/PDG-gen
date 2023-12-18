import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] strs = br.readLine().split("\\s+");
        num = new int[n];
        for (int i=0; i<n; i++){
            num[i] = Integer.parseInt(strs[i]);
        }

        int q = Integer.parseInt(br.readLine());
        strs = br.readLine().split("\\s+");
        for (int i=0; i<q; i++){
            if (solve(0, Integer.parseInt(strs[i]))){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
            }
        }
    }

    private static boolean solve(int i, int m) {
        if (m == 0){
            return true;
        }
        if (i >= n){
            return false;
        }

        boolean res = solve(i+1, m) || solve(i+1, m-num[i]);
        return res;
    }
}