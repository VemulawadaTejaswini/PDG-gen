import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(0);
        String s1 = sc.next();
        if (s1.equals("Vacant")) {
            return;
        }
        System.out.println(n - 1);
        String s2 = sc.next();
        if (s2.equals("Vacant")) {
            return;
        }
        int left = -1;
        int right = n;
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            System.out.println(mid);
            String s = sc.next();
            if (s.equals("Vacant")) {
                return;
            }
            if (mid % 2 == 0 && s.equals(s1)
                || mid % 2 != 0 && s.equals(s2)) {
                left = mid;
            } else {
                right = mid;
            }
        }

    }

}
