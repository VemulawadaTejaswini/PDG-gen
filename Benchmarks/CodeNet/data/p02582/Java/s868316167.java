import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        if (S.equals("SSS")) System.out.println(0);
        if (S.equals("SSR")) System.out.println(1);
        if (S.equals("SRS")) System.out.println(1);
        if (S.equals("RSS")) System.out.println(1);
        if (S.equals("RRS")) System.out.println(2);
        if (S.equals("RSR")) System.out.println(1);
        if (S.equals("SRR")) System.out.println(2);
        if (S.equals("RRR")) System.out.println(3);

    }

    public static void main(String[] args) {
        new Main().solve();
    }
}