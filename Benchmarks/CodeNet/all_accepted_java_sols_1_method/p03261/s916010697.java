import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> w = new HashSet<>();
        String[] ww = new String[n];
        for (int i = 0; i < n; i++) {
            ww[i] = sc.next();
        }
        w.add(ww[0]);
        for (int i = 0; i < n - 1; i++) {
            String tmp1 = ww[i].substring(ww[i].length() - 1, ww[i].length());
            String tmp2 = ww[i + 1].substring(0, 1);
            if(!tmp1.equals(tmp2)) {
                System.out.println("No");
                return;
            }
            w.add(ww[i + 1]);
        }
        if(w.size() == n) System.out.println("Yes");
        else System.out.println("No");
    }
}