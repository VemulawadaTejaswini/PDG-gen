import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H == 0 && W == 0) {
                break;
            }
            int i = 0;
            for(int j = 0; i < H; j++) {
                if(i % 2 == 0) {
                    if(W % 2 == 0) {
                        for(int k = 0; k < W/2; k++) {
                            System.out.print("#.");
                        }
                    }else {
                        for(int k = 0; k < W/2; k++) {
                            System.out.print("#.");
                        }
                        System.out.print("#");
                    }
                }else {
                    if(W % 2 == 0) {
                        for(int k = 0; k < W/2; k++) {
                            System.out.print(".#");
                        }
                    }else {
                        for(int k = 0; k < W/2; k++) {
                            System.out.print(".#");
                        }
                        System.out.print(".");
                    }
                }
                System.out.println("");
                i++;
            }
            System.out.println("");
        }
    }
}

