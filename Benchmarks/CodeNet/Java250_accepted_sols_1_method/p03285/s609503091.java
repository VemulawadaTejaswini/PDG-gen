import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        boolean flg = false;


        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                int judge = 4 * i + 7 * j;
                if (N == judge) {
                    flg = true;
                }
            }
        }
        if (flg == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}