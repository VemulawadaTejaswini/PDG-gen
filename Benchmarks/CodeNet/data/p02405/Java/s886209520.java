import java.util.*;

class Main{
    Scanner sc = new Scanner(System.in);
    
    Main(){
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if ( H == 0 && W == 0 ) break;
            for ( int h = 0; h < H; h++){
                if ( h % 2 == 0){
                    for ( int w = 0; w < W; w++){
                        if ( w % 2 == 0 ){
                            System.out.print("#");
                        }else{
                            System.out.print(".");
                        }
                    }
                }else{
                    for ( int w = 0; w < W; w++){
                        if ( w % 2 == 0 ){
                            System.out.print(".");
                        }else{
                            System.out.print("#");
                        }
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
                    
