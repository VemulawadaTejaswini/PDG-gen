import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int H = 0;
        int W = 0;
        int x = 0;
        int y = 0;
        
        while(true){
            H = sc.nextInt();
            W = sc.nextInt();
            
            if(H==0 && W ==0)break;
            for(x = 0; x < H; x++){
            for(y = 0; y < W; y++){
                if(x == 0 || x == H-1 || y == 0 || y == W-1){
                System.out.print("#");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println("");
                
            }
            System.out.println("");
        }
    }
}

