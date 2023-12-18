import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        while (H != 0 || W != 0) {
            for (int a = 1; a <= H; a++) {
                for (int b = 1; b <= W; b++) {
                    if (a%2 == 1 && b%2 == 0 || a%2 == 0 && b%2 == 1) {
                        System.out.print(".");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
            H = scan.nextInt();
            W = scan.nextInt();
        }

    }
}
