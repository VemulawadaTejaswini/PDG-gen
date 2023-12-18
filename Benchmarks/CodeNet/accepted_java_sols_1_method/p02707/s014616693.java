import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * N
 *  人の社員からなる会社があり、各社員には
 * 1
 * ,
 * .
 * .
 * .
 * ,
 * N
 *  の社員番号が割り当てられています。
 *
 * 社員番号
 * 1
 *  の社員以外の全ての社員には、自分より社員番号が小さい直属の上司がちょうど
 * 1
 *  人います。
 *
 * X
 *  さんが
 * Y
 *  さんの直属の上司であるとき、
 * Y
 *  さんは
 * X
 *  さんの直属の部下であるといいます。
 *
 * 社員番号
 * i
 *  の社員の直属の上司の社員番号が
 * A
 * i
 *  であることが与えられます。各社員について直属の部下が何人いるか求めてください。
 */
public class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] ans = new int[N];
        Arrays.fill(ans, 0);
        for (String An: br.readLine().split(" ")) {
            ans[Integer.valueOf(An) - 1]++;
        }

        for (int i: ans) {
            System.out.println(i);
        }
    }
}