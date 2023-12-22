import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i++ < 1000) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H < 3 || W < 3) break;
            for(int j=0; j<H; j++) {
                for(int k=0; k<W; k++) {
                    if(j == 0 || j == H-1) System.out.printf("#");
                    else if(k == 0 || k == W-1) System.out.printf("#");
                    else System.out.printf(".");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

