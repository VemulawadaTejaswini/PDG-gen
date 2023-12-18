import java.util.Scanner;
 
class Main{
  public static void main(String[] arg){
    int H, W;

    Scanner in = new Scanner(System.in);

    while(true){
        H = in.nextInt();
        W = in.nextInt();

        if(H == 0 && W == 0) return;
        
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(i%2 == 0){
                    if(j%2 == 0)
                        System.out.print("#");
                    else
                        System.out.print(".");
                }
                else {
                    if(j%2 == 0)
                        System.out.print(".");
                    else
                        System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
  }
}