import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int i,j;
        Scanner sc = new Scanner(System.in);
        while(true) {
            int C = 0;
            int H = sc.nextInt();
            int W = sc.nextInt();
            if (H == 0 && W == 0) break;
            for(i=0;i<H;i++){
                for(j=0;j<W;j++){
                    if(C==0){
                        System.out.printf("#");
                        C = 1;
                        continue;
                    }
                    if(C==1) {
                        System.out.printf(".");
                        C = 0;
                        continue;
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}
