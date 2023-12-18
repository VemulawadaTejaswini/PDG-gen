import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; ; ++i){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H==0 || W ==0){
                break;
            }
            for(int k = 0; k < H; ++k){
                for(int j = 0; j < W; ++j){
                    if(k % 2 == 0) {
                        if (j % 2 == 0) {
                            System.out.printf("#");
                        }
                        else if(j % 2 == 1){
                            System.out.printf(".");
                        }
                    }
                    else if(k % 2 == 1) {
                        if(j % 2 == 0){
                            System.out.printf(".");
                        }
                        else if(j % 2 == 1){
                            System.out.printf("#");
                        }
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}