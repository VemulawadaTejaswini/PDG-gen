import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        StringBuilder s = new StringBuilder(sc.nextLine());
        StringBuilder t = new StringBuilder(sc.nextLine());
        int ovCount = 0;
        for (int i = 0; i < N; ++i) {
            if (s.substring(i).equals(t.substring(0, N - i))) {
                ovCount = N - i;
                break;
            }
        }
        System.out.println((s.length() + t.length() - ovCount));
    }
}