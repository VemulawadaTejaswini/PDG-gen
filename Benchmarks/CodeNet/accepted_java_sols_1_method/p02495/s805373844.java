import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        while(true){
            int h = scn.nextInt();
            int w = scn.nextInt();
            if(h==0&&w==0) break;
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    if((i%2 + j%2)%2 == 1){
                        System.out.printf(".");
                    }else{
                        System.out.printf("#");
                    }
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }
    }
}