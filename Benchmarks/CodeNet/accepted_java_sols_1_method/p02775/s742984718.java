
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc = null;
    static PrintWriter pw = null;

    static {

        try {
            sc = new Scanner(System.in);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final long MOD = 1_000_000_007;

    private static String data;

    private static int[][] dd;

    public static void main(String[] args) {
        data = sc.next();
        dd = new int[data.length()][2];
        int l = data.length() - 1;
        for (int t = 0; t < dd.length; t++) {
            dd[t][0] = -1;
            dd[t][1] = -1;
        }

        for (int endIndex = 0 ; endIndex < data.length() ; endIndex++) {
            int ii = data.charAt(endIndex) - '0';
            for (int overcharge = 0 ; overcharge<= 1 ; overcharge++) {
                ii += overcharge;
                dd[endIndex][overcharge] = Math.min((endIndex == 0 ? 0 : dd[endIndex - 1][0]) + ii,
                        (endIndex == 0 ? 1 : dd[endIndex - 1][1]) + 10 - ii);
            }

        }


        System.out.println(dd[l][0]);
    }





}
