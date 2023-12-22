
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 1 ; i <= k ;i++) {
            if (i % 2 == 0) {
                a++;
            }else {
                b++;
            }
        }
        System.out.println(a * b);
    }

}
