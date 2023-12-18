import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int H = sc.nextInt();
      int W= sc.nextInt();

      if (H == 0 && W == 0) { break; }

      for(int i=1; i <= H; i++){
        if(i % 2 == 0){
          int j = 0;
          while(j <= W){
            if(W == 1){
              System.out.print(".");
              break;
            } else {
              System.out.print(".");
              j++;
              if(j == W){ break; }
              System.out.print("#");
              j++;
              if(j == W){ break; }
            }
          }
        }
        if(i % 2 != 0){
          int j = 0;
          while(j <= W){
            if(W == 1){
              System.out.print("#");
              break;
            } else {
              System.out.print("#");
              j++;
              if(j == W){ break; }
              System.out.print(".");
              j++;
              if(j == W){ break; }
            }
          }
        }
        System.out.print("\n");
      }
      System.out.printf("\n");
    }
  }
}

