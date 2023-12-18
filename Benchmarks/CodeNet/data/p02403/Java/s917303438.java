import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int W = scan.nextInt();
        int H = scan.nextInt();
        if(H != 0 && W != 0){
            for(int i = 0; i <= W - 1; i++){
                for(int j = 0; j <= H -1; j++){
                    System.out.println("#");
                }
            }
        }else{
            return;
        }
        System.out.println();
    }  
}