import java.util.Scanner;
public class Main{
    public static void main(String[] defargs){
        int H,W,i,j;
        Scanner scanner = new Scanner(System.in);
        while(true){
        H = scanner.nextInt();
        W = scanner.nextInt();
        if(H == 0 && W == 0 ){
            break;
        }
        for(i = 1;i <= H; i++){   //行方向
            for(j = 1; j <= W; j++){    //列方向
                if(( i + j )%2 == 0){
                    System.out.print("#");
                }else{
                    System.out.print(".");
                } 
            }
            System.out.println();
            }
            System.out.println();
        }
    }
}
