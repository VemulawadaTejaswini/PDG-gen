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
                if(j == 0 || j == H - 1) {
                    for(k = 0; k < W; k++) {
                        System.out.print("#");
                    }
                    System.out.println("");
                } else {
                for(k = 0; k < W; k++) {
                    if(k == 0 || k == W - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
}



