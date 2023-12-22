import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul4 = 0;
        int mul2 = 0;
        int mul1 = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a % 4 == 0) {
                mul4++;
            } else if (a % 2 == 0) {
                mul2++;
            } else {
                mul1++;
            }
        }
        if (mul2 > 0) {
            mul1++;
        }
        if (mul4+1 >= mul1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
