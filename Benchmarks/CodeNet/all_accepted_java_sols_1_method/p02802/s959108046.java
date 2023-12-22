import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] ac = new int[n], wa = new int[n];
        int acc = 0, wac = 0;
        for (int i = 0; i < m; i++){
            int p = sc.nextInt() - 1;
            String s = sc.next();
            if (ac[p] == 1) continue;
            if (s.equals("AC")) {
                ac[p] = 1;
            } else {
                wa[p]++;
            }
        }
        for (int i = 0; i < n; i++) {
            acc += ac[i];
            if (ac[i] == 1) wac += wa[i];
        }
        System.out.println("" + acc + " " + wac);
    }
}