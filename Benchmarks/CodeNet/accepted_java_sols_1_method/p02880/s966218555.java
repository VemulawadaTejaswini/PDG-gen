import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            int mod = N % i;
            if (mod == 0) {
                int div1 = N / i;
                if (div1 >=1 && div1 <= 9) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}
