import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
        
    while (true) {
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int i;
        int j;
        
        if(H == 0 && W == 0){  
          break;
        }else{

             for ( i = 0; i < H; i++ ){
                for ( j = 0; j < W; j++ ){

                    System.out.print("#");
                }
                System.out.println("");
             }
              System.out.println();
        }
    }
    }
}

