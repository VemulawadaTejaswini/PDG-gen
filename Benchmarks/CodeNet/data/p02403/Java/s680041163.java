import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int W = scan.nextInt();
        int H = scan.nextInt();
        if(H != 0 && W != 0){
            for(int i = 0; i <= W; i++){
                for(int j = 0; j <= H; j++){
                    System.out.println("#");
                }
            }
        }else{
            return;
        }
    }  
}