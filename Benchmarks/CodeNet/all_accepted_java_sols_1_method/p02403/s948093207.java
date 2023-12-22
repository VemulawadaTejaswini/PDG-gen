import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        for(int i=1; ; i++){
            int H = scanner.nextInt();
            int W = scanner.nextInt();

            if(H == 0 && W == 0){
                break;
            }else{

                for(int j=0; j<H;j++){
                 for(int k=0; k<W; k++){
                    System.out.print("#");
                }
                    System.out.print("\n");
            }
        }
        System.out.print("\n");
    }
}
}
