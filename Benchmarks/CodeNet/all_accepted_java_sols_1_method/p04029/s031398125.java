import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }

        System.out.println(sum);

        in.close();
    }
}
