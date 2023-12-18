import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int H, W;

    while(true){
      H = sc.nextInt();
      W = sc.nextInt();
      if(H==0 && W==0) break;

      for (int i=0; i<H; i++) {
        if(i==0 || i==H-1){
          for (int j=0; j<W; j++) {
            System.out.printf("#");
          }
          System.out.printf("\n");
        }
        else{
          for (int j=0; j<W; j++) {
            if (j==0 || j==W-1) System.out.printf("#");
            else System.out.printf(".");
          }
          System.out.printf("\n");
        }
      }
      System.out.printf("\n");
    }
  }
}

