import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String w = sc.next().toLowerCase();
        int cnt = 0;
        while (sc.hasNext()) {
            if (w.equals(sc.next().toLowerCase())) cnt++;
        }
        System.out.println(cnt);
    }
}

