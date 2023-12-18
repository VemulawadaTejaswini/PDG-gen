import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            
            if(H==0 && W==0) return;
            for(int y=0; y<H; y++){
                for(int x=0; x<W; x++){
                    if((x+y) % 2 == 0){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

