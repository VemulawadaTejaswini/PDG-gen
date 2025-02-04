import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String[] inputs = reader.readLine().split(" ");
        String A = inputs[0];
        String B = inputs[1];
        String C = inputs[2];
        if((A.charAt(A.length()-1) == B.charAt(0)) && (B.charAt(B.length()-1) == C.charAt(0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}