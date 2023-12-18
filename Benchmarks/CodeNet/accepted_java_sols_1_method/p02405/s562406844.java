import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        for(i = 0; ; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H == 0 || W == 0) break;
            for(j = 0; j < H; j++) {
                if(j % 2 == 0) {
                for(k = 0; k < W; k++) {
                    if(k % 2 == 0){
                    System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
            } else {
                for(k = 0; k < W; k++) {
                    if(k % 2 == 1){
                    System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
            }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
