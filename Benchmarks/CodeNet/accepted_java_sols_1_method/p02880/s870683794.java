import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 1; i < 10; i++) {
            if (num / i < 10 && num % i == 0) {
                flag = true;
            }
        }

        System.out.println(flag ? "Yes" : "No");
    }
}