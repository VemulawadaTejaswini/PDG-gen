import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if (x <= 9 && x >= 1 && y <= 9 && y>= 1) {
            long result = y * x;
            System.out.println(result);
        } else {
            long result = -1;
            System.out.println(result);
        }
    }
}
