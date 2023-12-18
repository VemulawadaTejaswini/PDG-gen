import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int W = scan.nextInt();
        int i;
        int U;
        
        while (H != 0 || W != 0) {

            for (U = 1; U <= H; U++) {
                for (i = 1; i <= W; i++) {
                    if (i == 1 || i == W || U == 1 || U == H) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
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

