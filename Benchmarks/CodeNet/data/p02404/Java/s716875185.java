import java.util.*;

class Main{
    Scanner sc = new Scanner(System.in);
    
    Main(){
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if ( H == 0 && W == 0 ) break;
            for ( int row = 0; row < H; row++){
                for ( int col = 0; col < W; col++){
                    if ( row == 0 || row == (H - 1) || col == 0 || col == (W - 1) ) {
                        System.out.print("#");
                    }else {
                        System.out.print(".");
                    }
                }
                System.out.print("\n");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        new Main();
    }
}
                    
