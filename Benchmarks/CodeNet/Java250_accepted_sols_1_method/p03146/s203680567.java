import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.next());
        int n = 1;
        if (s == 1 || s == 2) {
            n = 4;
        } else {
            while (s != 4) {
                if (s % 2 == 0) {
                    s /= 2;
                } else {
                    s = s * 3 + 1;
                }
                n += 1;
            }
            n += 3;
        }
        System.out.print(n);
    }
}