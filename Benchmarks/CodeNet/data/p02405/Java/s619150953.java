import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int H, W, i;
    int k=0;

    H = sc.nextInt();
    W = sc.nextInt();

    for(i=0; i<H; i++){
      if(i%2==0 && W%2==0){
        for(k=0; k<W/2; k++){
          System.out.printf("#.");
        }
        System.out.printf("\n");
      }
      else if(i%2==0 && W%2==1){
        for(k=0; k<W/2; k++){
          System.out.printf("#.");
          System.out.printf("#");
        }
        System.out.printf("\n");
      }
      else if(i%2==1 && W%2==0){
        for(k=0; k<W/2; k++){
          System.out.printf(".#");
        }
        System.out.printf("\n");
      }
      else if(i%2==1 && W%2==1){
        for(k=0; k<W/2; k++){
          System.out.printf(".#");
          System.out.printf(".");
        }
        System.out.printf("\n");
      }
    }
  }
}

