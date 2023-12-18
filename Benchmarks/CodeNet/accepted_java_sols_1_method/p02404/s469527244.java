import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            int H = input.nextInt();
            int H1 = H - 2;
            int W = input.nextInt();
            int W1 = W - 2;
            if(H == 0 && W == 0){
                break;
            }
            for(int a = 0; a < W; a++){
                System.out.printf("#");
            }
            System.out.printf("\n");
            //第一行目の”＃”
            for(int b = 0; b < H1; b++){
                System.out.printf("#");
                for(int c = 0; c < W1; c++){
                    System.out.printf(".");
                }
                System.out.printf("#\n");
            }


            for(int a = 0;a < W; a++){
                System.out.printf("#");
            }
            //最後行目の”＃”

            System.out.printf("\n");
            System.out.printf("\n");
        }
    }
}
