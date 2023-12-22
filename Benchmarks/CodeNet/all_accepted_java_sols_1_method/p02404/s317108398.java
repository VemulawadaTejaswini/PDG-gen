import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        for(;;){
            int H = scan.nextInt();
            int W = scan.nextInt();
            if(H != 0 && W != 0){
                for(int i = 1; i <= H; i++){
                    System.out.print("#");
                    if(i != 1 && i != H){
                        for(int j = 1; j < W; j++){
                            if(j != W - 1){
                                System.out.print(".");
                            }else{
                                System.out.print("#");
                            } 
                        }
                    }else{
                        for(int j = 1; j < W; j++){
                            System.out.print("#");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }else{
                break;
            }
        }    
    }
}