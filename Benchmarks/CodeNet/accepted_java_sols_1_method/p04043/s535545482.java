import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        switch (A) {
        case 5:
            if (B == 5 && C == 7 || B == 7 && C == 5) {
                System.out.println("YES");
                return;
            }
            System.out.println("NO");
            return;
        case 7:
            if (B == 5 && C == 5) {
                System.out.println("YES");
                return;
            }
            System.out.println("NO");
            return;
        default:
            System.out.println("NO");
        }
    }
}