import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int H=sc.nextInt();
            int W=sc.nextInt();
            if(H==0&&W==0)
            break;
            for(int y=0;y<H;y++){
                if(y%2==0){
                     for(int x=0;x<W;x++){ 
                         if(x%2==0){
                         System.out.print("#");
                         }else{
                         System.out.print(".");
                         }
                     }
                }else{
                    for(int x=0;x<W;x++){
                        if(x%2==0){
                        System.out.print(".");
                        }else{
                        System.out.print("#");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
