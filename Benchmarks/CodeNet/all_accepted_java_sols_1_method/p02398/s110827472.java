import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int z = Integer.parseInt(sc.next());
        int cnt = 0;
        for (int i = x; i <= y; i++) {
            if (z % i == 0) cnt++;
        }
        System.out.println(cnt);
    }
}

