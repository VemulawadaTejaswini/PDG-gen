import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        ArrayList<Integer> b_list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            b_list.add(Integer.parseInt(sc.next()));
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0, a = 0; j < m; j++) {
                a = Integer.parseInt(sc.next());
                sum += a * b_list.get(j);
            }
            sum += c;
            if (sum > 0) {
                ans++;
            }
        }
        out.println(ans);
        sc.close();
        out.close();
    }

}