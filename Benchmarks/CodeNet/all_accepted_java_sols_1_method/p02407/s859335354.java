import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nl[] = new int[n];

        for (int i = 0; i < n; i++) {
            nl[i] = sc.nextInt();
        }

        for (int j = nl.length-1; j >= 0; j--) {
            if (!(j == 0)) {
                System.out.print(nl[j] + " ");
            } else {
                System.out.println(nl[j]);
            }
        }
    }
}