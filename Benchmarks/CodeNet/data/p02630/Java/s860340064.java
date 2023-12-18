import java.io.*;
import java.util.*;


/**
 * Created by Ayushi on 21 Jun 2020.
 * Problem:
 * Round:
 */

public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String in = br.readLine();
        st = new StringTokenizer(in, " ");
        int a;
        long tot = 0;
        while (st.hasMoreTokens()) {
            a = Integer.parseInt(st.nextToken());
            tot += a;
        }
        int q = Integer.parseInt(br.readLine());
        String ori, rep;
        int b, c;

        int occ, diff;
        String z = " " + in + " ";
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            ori = st.nextToken();
            b = Integer.parseInt(ori);
            rep = st.nextToken();
            c = Integer.parseInt(rep);

            occ = 0;
            while (z.contains(" " + ori + " ")) {
                occ++;
                z = z.replaceFirst(" "+ori+" ", " "+rep+" ");
            }
            diff = (c-b)*occ;
            tot += diff;
            System.out.println(tot);

        }
        br.close();
    }
}
