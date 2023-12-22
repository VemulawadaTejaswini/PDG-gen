import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        //

        if (k > (n - 1) * (n - 2) / 2 ) {
            System.out.println(-1);
            return;
        }
        int b = (n - 1) * (n - 2) / 2 - k;
        System.out.println(n - 1 + b);
        for (int i = 1 ; i < n ; i++) {
            System.out.println(1 + " " +( i + 1));
        }
        int count = 0;
        for (int i = 1 ; i < n ; i++) {
            for (int j = 1 ; j < n ; j++) {
                if (i < j && count < b) {
                    System.out.println(i + 1 + " " + (j + 1));
                    count++;
                }
            }
        }



    }

}
