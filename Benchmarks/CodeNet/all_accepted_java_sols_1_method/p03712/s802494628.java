import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        String[] a = new String[H];
        for (int i = 0; i < H ; i++) {
            a[i] = sc.next();
        }

        for (int i = 0; i <= H + 1; i++) {
            if (i == 0 || i == H + 1) {
                for (int j = 0; j <= W + 1; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }else{
                System.out.println("#" + a[i - 1] + "#");
            }
        }
    }
}
