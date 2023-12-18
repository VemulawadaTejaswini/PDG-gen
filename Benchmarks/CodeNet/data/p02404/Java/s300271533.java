import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      int a = sc.nextInt();
      int b = sc.nextInt();
      if ( a == 0 && b == 0){ break; }
      for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= b; j++){
          if (i == 1 || i == a){
            System.out.print("#");
          } else{
            if (j == 1 || j == b) {
              System.out.print("#");
            } else {
              System.out.print(".");
            }
          }
        }
        System.out.print("\n");
      }
      System.out.print("\n");
    }
  }
}

