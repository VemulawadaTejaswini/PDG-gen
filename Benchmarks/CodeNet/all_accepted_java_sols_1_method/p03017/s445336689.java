import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int A = Integer.parseInt(arr[1]) - 1;
        int B = Integer.parseInt(arr[2]) - 1;
        int C = Integer.parseInt(arr[3]) - 1;
        int D = Integer.parseInt(arr[4]) - 1;
        String S = br.readLine();
        String ans = "Yes";
        String reg1 = "#{2}";
        String reg2 = "\\.{3}";
        Pattern p1 = Pattern.compile(reg1);
        Pattern p2 = Pattern.compile(reg2);

        if (C < D) {
            String routeA = S.substring(A + 1, C);
            String routeB = S.substring(B + 1, D);
            Matcher ma = p1.matcher(routeA);
            Matcher mb = p1.matcher(routeB);
            if (ma.find() || mb.find()) {
                ans = "No";
            } 
        } else {
            int pStart = 0;
            int pEnd = D + 2;
            if (B - A == 1) {
                pStart = A;
            } else {
                pStart = B - 1;
            }
            String routeA = S.substring(A + 1, C);
            String routeB = S.substring(B + 1, D);
            String routeAPrime = S.substring(pStart, pEnd);
            Matcher ma = p1.matcher(routeA);
            Matcher mb = p1.matcher(routeB);
            Matcher maPrime = p2.matcher(routeAPrime);
            if (ma.find() || mb.find() || !maPrime.find() ) {
                ans = "No";
            } 
         }

        out.println(ans);
        out.close();
    }
}
