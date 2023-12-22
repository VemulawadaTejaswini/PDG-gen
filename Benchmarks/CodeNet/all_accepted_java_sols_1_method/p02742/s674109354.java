import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long h = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());
        if(Math.min(h, w) == 1) {
            System.out.println(1);
        } else if(Math.min(h % 2, w % 2) == 1) {
            System.out.println((h * w + 1) / 2);
        } else {
            System.out.println(h * w / 2);
        }
    }
}
