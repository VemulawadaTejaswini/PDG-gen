import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = 1;
        int W = 1;

        while(true) {
            H = sc.nextInt();
            W = sc.nextInt();
            if(H == 0 && W == 0) break;

            for (int i = 0; i < H; i++){
                for (int j = 0; j < W; j++) {
                    if(i == 0 || i == H-1) System.out.printf("#");
                    else {
                        if(j == 0 || j == W-1) System.out.printf("#");
                        else System.out.printf(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
