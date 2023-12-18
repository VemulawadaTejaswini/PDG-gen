import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        while (H != 0 || W != 0) {
            for ( int a = 0; a < H; a++) {
                for ( int b = 0; b < W; b++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
             System.out.println("");
            H = scan.nextInt();
            W = scan.nextInt();
        }

    }
}
