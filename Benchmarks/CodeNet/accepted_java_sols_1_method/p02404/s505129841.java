import java.util.Scanner;
public class Main {
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     for(int i=1;i>0; i++){
          int H = scanner.nextInt();
          int W = scanner.nextInt();
          if(H==0&&W==0)break;
          for(int j=1;j<=H; j++){
              for(int k=1;k<=W; k++){
                if(1<j&&1<k){
                    if(j<H&&k<W){
                         System.out.print(".");
                    }else{
                        System.out.print("#");
                    }
                }else{
                   System.out.print("#");  
                }
              }
              System.out.println();
          }
          System.out.println();
   }   
}
}