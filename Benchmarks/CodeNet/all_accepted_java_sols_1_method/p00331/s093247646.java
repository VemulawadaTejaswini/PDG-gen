import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        if (h + r > 0) {
            System.out.println(1);
        } else if (h + r == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}

