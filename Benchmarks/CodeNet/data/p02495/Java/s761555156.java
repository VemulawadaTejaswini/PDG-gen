import java.util.Scanner;
public class pro31{ 
  public static void main(String[] args) {                       
    Scanner sc = new Scanner(System.in); 
    while (true) { 
      int H = sc.nextInt(); 
      int W= sc.nextInt(); 
      if (H == 0 && W == 0) { 
        break; 
      }
      for(int i=1;i<=H;i++){
        for(int j=1;j<=W/2;j++){
          if(i%2==1){
            System.out.print("#.");
          }
          else if(i%2==0){
            System.out.print(".#");
          }
        }
        if(W%2==1 && i%2==1){
          System.out.print("#");
        }
        else if(W%2==1 && i%2==0){
          System.out.print(".");
        }
        System.out.print("\n");
      }
      System.out.print("\n");
    }
  }
}