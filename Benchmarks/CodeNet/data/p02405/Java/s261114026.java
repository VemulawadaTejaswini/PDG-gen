import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int H = sc.nextInt();
        int W = sc.nextInt();

        for (i = 0; i < H; i++) {
            if (H == 0 && W == 0) {
                break;
            }
            if(i%2==0) {
                for (j = 0; j < W; j++) {
                    if (j % 2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.print("\n");
            }else{
                for (j = 0; j < W; j++) {
                    if (j % 2 == 1) {
                        System.out.print(".");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.print("\n");
            }
            }
        }
    }

