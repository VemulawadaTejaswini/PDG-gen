import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char[] p = {'A', 'B', 'C'};
        int idx = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != p[idx]) {
                idx = s.charAt(i) == p[0] ? 1 : 0;
            }
            else idx++;
            if (idx == 3) {
                idx = 0;
                count++;
            }
        }
        System.out.println(count);
    }
}