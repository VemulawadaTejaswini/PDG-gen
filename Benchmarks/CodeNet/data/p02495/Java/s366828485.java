import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int H = sc.nextInt();
      int W = sc.nextInt();

      for(int i=1;i<=H;i++){

        if(i%2==1){
          for(int j=1;j<=W;j++){
          System.out.printf("#");
          j++;
          if(j>W)break;
          System.out.printf(".");
          }
        }

        else{
          for(int j=1;j<=W;j++){
          System.out.printf(".");
          j++;
          if(j>W)break;
          System.out.printf("#");
          }
        }

      System.out.printf("\n")
      }
    System.out.printf("\n")
    }
  }
}