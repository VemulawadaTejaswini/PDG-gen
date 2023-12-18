import java.util.Scanner;
class KMP {
    private final int R;       // the radix
    private int[][] dfa;       // the KMP automoton

    private String pat;        // or the pattern string

    /**
     * Preprocesses the pattern string.
     *
     * @param pat the pattern string
     */
    public KMP(String pat) {
        this.R = 256;
        this.pat = pat;

        // build DFA from pattern
        int m = pat.length();

        dfa = new int[m+1][R];

        dfa[0][pat.charAt(0)] = 1;
        int x = 0;
        for (int j = 1; j < m; j++) {
            System.arraycopy(dfa[x], 0, dfa[j], 0, R);

            dfa[j][pat.charAt(j)] = j + 1;   // Set match case.

            x = dfa[x][pat.charAt(j)];     // Update restart state.

        }

        // last char
        System.arraycopy(dfa[x], 0, dfa[m], 0, R);

    }

    void search(String T) {
        if(T.length() < pat.length()) return;

        for (int s = 0, i = 0; i < T.length(); i++) {
            s = dfa[s][T.charAt(i)];
            if(s == this.pat.length())
                System.out.println(i-this.pat.length()+1);
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String T = in.nextLine();
        String P = in.nextLine();

        KMP kmp = new KMP(P);

        kmp.search(T);
    }
}

