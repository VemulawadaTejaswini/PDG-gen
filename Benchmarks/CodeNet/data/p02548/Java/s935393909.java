import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int cpt = 0;
        for (int c = 1; c < n; ++c) {
            cpt += nbFactors(n - c);
        }
        out.println(cpt);
    }

    public static int nbFactors(int n) {
        int cpt = 0;
        for(int i = 1; i <= (int) Math.sqrt(n); i++)
        {
            if(n % i == 0 && i * i != n)
            {
                cpt += 2;
            }
            else if (i * i == n)
            {
                cpt++;
            }
        }
        return cpt;
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
        }
    }
}
