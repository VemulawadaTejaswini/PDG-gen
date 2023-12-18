import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int cnt = 0;
        a = a - c;
        while (a - (b + c) >= 0) {
            a = a - (b + c);
            cnt++;
        }
        System.out.println(cnt);
    }
}
