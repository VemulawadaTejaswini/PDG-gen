import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long h = sc.nextLong();
        Long w = sc.nextLong();
        if (h == 1 || w ==1) {
            System.out.println(1);
        } else {
            long res = h * (w/2);
            if (w % 2 == 1) {
                res += (h+1)/2;
            }
            System.out.println(res);
        }
    }
}