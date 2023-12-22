import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.util.*;

public class Main {

    public static StringBuilder output = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next().trim();
        String b = in.next().trim();
        String c = in.next().trim();
        Solver solver = new Solver();
        solver.solve(a, b, c);
        System.out.println(output);
    }

}

class Solver {
    public void solve(String a, String b, String c) {
        String ans = "";
        char turn = 'a';
        int an = a.length();
        int bn = b.length();
        int cn = c.length();
        while (true) {
            if (turn == 'a') {
                if (an == 0) {
                    ans = "A";
                    break;
                }
                turn = a.charAt(a.length() - an);
                an--;
            }

            if (turn == 'b') {
                if (bn == 0) {
                    ans = "B";
                    break;
                }
                turn = b.charAt(b.length() - bn);
                bn--;
            }

            if (turn == 'c') {
                if (cn == 0) {
                    ans = "C";
                    break;
                }

                turn = c.charAt(c.length() - cn);
                cn--;
            }
        }
        Main.output.append(ans);
    }
}