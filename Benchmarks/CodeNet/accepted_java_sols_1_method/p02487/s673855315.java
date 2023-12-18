import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int H = sc.nextInt();
      int W = sc.nextInt();
      if(H==0 && W==0)break;

      for(int i=1;i<=W;i++){
        System.out.printf("#");
      }
      System.out.printf("\n");

      for(int i=2;i<H;i++){
        System.out.printf("#");
        for(int j=2;j<W;j++){
          System.out.printf(".");
        }
        System.out.printf("#");
        System.out.printf("\n");
      }

      for(int i=1;i<=W;i++){
        System.out.printf("#");
      }
      System.out.printf("\n");

      System.out.printf("\n");
    }
  }
}