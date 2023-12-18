import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0) {
                break;
            }
            int i, j;
            for (i = 0; i < H; i++) {

                if(i==0 || i==H-1){
                    for (j = 0; j < W; j++) {
                        System.out.printf("#");
                    }
                    System.out.printf("\n");
                }else{
                    for (j = 0; j < W; j++) {
                        if(j==0 || j==W-1){
                            System.out.printf("#");
                        }else{
                            System.out.printf(".");
                        }
                    }
                    System.out.printf("\n");
                }
            }
            System.out.printf("\n");
        }
    }
}

