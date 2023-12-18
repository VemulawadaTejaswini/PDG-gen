import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        for(int i = 1; ; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H == 0 && W == 0) break;
            for(int j = 0; j<H; j++){
                for(int k = 0; k<W; k++){
                    if((j+k)%2 == 0){
                        System.out.printf("#");
                    }else{
                        System.out.printf(".");
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
        sc.close();
    }
}
