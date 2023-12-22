import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String raw = sc.next();
        int x = Integer.parseInt(raw);
        int s = x % 60;
        int m = x / 60;
        int h = m / 60;
        m = m % 60;
        System.out.printf("%d:%d:%d\n", h, m, s);
        
    }
}
