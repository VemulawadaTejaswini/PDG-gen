import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
        while(true){
           int H=sc.nextInt();
           int W=sc.nextInt();
           if(H==0){
               if(W==0)break;
           }else{
                for(int i=1;i<=H;i++){
                    for(int j=1;j<=W;j++){
                        System.out.print("#");
                    }
                    System.out.println();
                }
           }
          System.out.println();
        }
           
    }
}
