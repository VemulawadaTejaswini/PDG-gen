import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split("");

        int startWithZeroCount = 0;
        int startWithOneCount = 0;
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if (i % 2 == 0) {
                if (s.equals("0")) {
                    startWithOneCount++;
                } else {
                    startWithZeroCount++;
                }
            } else {
                if (s.equals("0")) {
                    startWithZeroCount++;
                } else {
                    startWithOneCount++;
                }
            }
        }
        out.println(Math.min(startWithOneCount, startWithZeroCount));
        out.close();
    }
}
