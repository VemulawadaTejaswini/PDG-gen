import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        while(true) {
            int H = stdIn.nextInt();
            int W = stdIn.nextInt();
            int i;
            int j;
            if(H == 0 && W == 0) {
                break;
            }
            for(i = 0; i < H; i++) {
                for(j = 0; j < W; j++) {
                    if(j % 2 == 1) {
                        if(i % 2 == 1) {
                            System.out.print("#");
                        } else {
                            System.out.print(".");
                        }
                    } else {
                        if(i % 2 == 1) {
                            System.out.print(".");
                        } else {
                            System.out.print("#");
                        }
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
