import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        int a = n * (n - 1) / 2 +  n * l;
        int d = 1000000;
        int index = 0;
        for (int i = 0 ; i < n ; i++ ) {
            int b = a - (l + i);
            if (Math.abs(b - a) < d) {
                d = Math.abs(b - a);
                index = i;
            }

        }
        System.out.println(a - (l + index));
    }

}