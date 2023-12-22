import java.util.Scanner;

public class Main {
    public static void main(String[] srgs) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i++ < 1000){
            int H = sc.nextInt();
            if(H == 0) break;
            int W = sc.nextInt();
            for(int j=0; j<H; j++) {
                for(int k=0; k<W; k++) {
                    System.out.printf("#");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

