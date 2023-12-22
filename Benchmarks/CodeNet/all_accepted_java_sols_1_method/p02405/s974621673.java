import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m;
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H==0 && W==0){
                break;
            }
            for(m = 0;m < H;m++){
                if( m%2 != 0){
                    for(n = 0; n < W ;n++){
                        if( n % 2 != 0){
                            System.out.print("#");
                        }
                        else{
                            System.out.print(".");
                        }
                    }
                    //System.out.println("");
                }
                else{
                    for(n = 0;n < W; n++){
                        if( n%2 != 0){
                            System.out.print(".");
                        }
                        else{
                            System.out.print("#");
                        }
                        //System.out.println("");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
