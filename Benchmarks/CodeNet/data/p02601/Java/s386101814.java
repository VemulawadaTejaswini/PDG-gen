import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        boolean flg = false;
        for (int i = 0 ; i <= k ; i++) {
            for (int j = 0 ; j <= k ; j++) {
                for (int l = 0 ; l <= k ; l++) {

                    if (i + j + l == k) {
                        if (Math.pow(2, i) * a < Math.pow(2, j) * b && Math.pow(2, j) * b < Math.pow(2, l) * c) {
                            flg = true;
                        }
                    }
                }
            }
        }
        System.out.println(flg ? "Yes" : "No");
    }

}
