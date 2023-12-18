import java.util.Scanner;
public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
        int H,W;
        while(true){
           H = scanner.nextInt();
           W = scanner.nextInt();
          if ( H == 0 && W == 0 ){
              break;
            }
        for ( int i = 0; i < H; i++ ){
             for ( int j = 0; j < W; j++ ){
               System.out.print("#");		       
            }
            System.out.println();
        }
        System.out.println();
    }
  }
}
