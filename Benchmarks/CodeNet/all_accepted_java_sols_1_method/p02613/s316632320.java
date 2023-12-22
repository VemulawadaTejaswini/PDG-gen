import java.io.*;
import java.util.*;

/**
 * Created by Ayushi on 05 Jul 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        String a;
        int AC, WA, TLE, RE;
        AC = WA = TLE = RE = 0;
        while (n-- > 0) {
            a = br.readLine();

            if (a.equals("AC")) AC++;
            else if (a.equals("WA")) WA++;
            else if (a.equals("TLE")) TLE++;
            else RE++;
        }
        br.close();

        System.out.println("AC x " + AC);
        System.out.println("WA x " + WA);
        System.out.println("TLE x " + TLE);
        System.out.println("RE x " + RE);
    }
}
