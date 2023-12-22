import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        if (num[0] == 1 && num[1] == 4
                && num[2] == 7 && num[3] == 9) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

}
