import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int num = 0;

        for (int i = 0; i < n; i++) {
            num += array[i];
        }

        if (num >= h) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}