import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int W = scan.nextInt();
        int i;
        int U;
        int K = 1;
        while (H != 0 || W != 0) {
            for (U = 1; U <= H; U++) {
                for (i = 1; i <= W; i++) {
                    System.out.print("#");

                }
                System.out.println("");

            }
            System.out.println("");
            H = scan.nextInt();
            W = scan.nextInt();
            K++;
        }
    }
}
