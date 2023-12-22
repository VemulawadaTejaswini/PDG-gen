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
                    for(int j = 1; j < W; j++){
                        System.out.print("#");
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