import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        boolean ans = false;
        for (int i = 0 ; i < n ; i++) {
            if (a[i] % 2 == 1) {
                ans = true;
            }
        }
        if (ans) {
            System.out.println("first");
        } else {
            System.out.println("second");
        }


    }

}
