import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        if (odd % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
