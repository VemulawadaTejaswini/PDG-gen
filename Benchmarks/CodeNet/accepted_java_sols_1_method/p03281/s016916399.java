import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val1 = sc.nextInt();

        int count = 0;
        for (int i = 9; i <= val1; i = i + 2) {
            int temp = 0;
            for (int n = 1; n <= i; n++) {
                if ((i % n) == 0) {
                    temp++;
                }
            }
            if (temp == 8) {
                count++;
            }
        }
        System.out.println(count);
    }
}