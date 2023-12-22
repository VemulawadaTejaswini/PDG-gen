
import java.util.Scanner;

public class Main{
    public static void main(String srgs[]) {
        int i = 0;

        Scanner sc = new Scanner(System.in);

        while (true) {

            int j = 0;
            char str[] = sc.nextLine().toCharArray();
            int a[] = new int[1000];
            if (str[0] == '0') {
                break;
            }

            for (i = 0; i < str.length; i++) {
                a[i] = str[i] - '0';
                j += a[i];
            }
            System.out.printf("%d\n", j);
        }

        sc.close();
    }
}
