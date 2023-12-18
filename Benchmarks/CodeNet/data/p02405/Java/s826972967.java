import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int H = sc.nextInt();
      int W= sc.nextInt();

      if (H == 0 && W == 0) { break; }

      for(int i=0; i < H; i++){
        if(i % 2 == 0){
          for(int j=0; j < W; j++){
            if(W == 1){
              System.out.print("#");
            } else {
              System.out.print(".");
              j++;
              if(j == W){ break; }
              System.out.print("#");
            }
          }
        }
        if(i % 2 != 0){
          for(int j=0; j < W; j++){
            if(W == 1){
              System.out.print("#");
            } else {
              System.out.print("#");
              j++;
              if(j == W){ break; }
              System.out.print(".");
            }
          }
        }
        System.out.print("\n");
      }
      System.out.printf("\n");
    }
  }
}

