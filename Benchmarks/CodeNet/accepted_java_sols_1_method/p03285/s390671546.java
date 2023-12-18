import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int jQuot = N /7;
        boolean can = false;

        for (int i = 0; i <= jQuot; i++) {

            if((N - (i * 7)) % 4 == 0 ) {
                can = true;
            }
        }
        System.out.println(can ? "Yes" : "No");
    }
}