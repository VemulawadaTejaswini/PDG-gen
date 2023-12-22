import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object o = run();
        if (o != null)
            System.out.println(o);
    }

    private static ArrayList<Integer> nScan(Scanner sc, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        return al;
    }

    private static Object run() {
        try (Scanner sc = new Scanner(System.in);) {
            int result = 0;
            char[] s = sc.next().toCharArray();
            char[] t = sc.next().toCharArray();
            //int y = sc.nextInt();
            //int t = sc.next();
            //ArrayList<Integer> x = nScan(sc, n);
            //ArrayList<Integer> y = nScan(sc, n);
            //ArrayList<String> s = nScan(sc, n);
            for (int i = 0; i < s.length; i++) {
                if (s[i] != t[i]) {
                    result++;
                }
            }
            return result;
        }
    }
}