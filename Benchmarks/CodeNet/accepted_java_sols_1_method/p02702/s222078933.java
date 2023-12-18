import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int P = 2019;
        final char[] str = in.nextLine().toCharArray();
        final int N = str.length;
        final int[] digits = new int[N + 1];
        for (int i = 0; i < N; i++) {
            digits[i + 1] = Character.getNumericValue(str[i]);
        }
        final int[] residueDP = new int[P];
        // store number of SUFFIXES with a given residue.
        // We can definitely enumerate all N of those, and we leverage
        // the fact that we can SUBTRACT suffixes in a way that
        // allows us to generate all valid substrings! This will be called
        // the substring from suffix trick!
        residueDP[0] = 1; // we can always build on top of the empty suffix!
        // Now we create a running suffix
        int suffix = 0;
        int shift = 1;
        long ans = 0;
        for (int pos = N; pos >= 1; pos--) {
            suffix = (suffix + shift * digits[pos]) % P;
            ans += residueDP[suffix];
            residueDP[suffix]++;
            shift = (shift * 10) % P;
        }
        System.out.println(ans);
    }
}
