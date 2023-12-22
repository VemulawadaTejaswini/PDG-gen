import java.util.Scanner;
public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
        int H,W,i,j;
        while(true){
           H = scanner.nextInt();
           W = scanner.nextInt();
           if ( H == 0 && W == 0 ){
               break;
            }
           for ( i = 1; i <= H; i++ ){
             for ( j = 1; j <= W; j++ ){
                if( i==1 || i==H || j==1|| j==W ){
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
              }
            System.out.println();
            }
           
            System.out.println();
        }    
    }
}
