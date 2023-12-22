import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(y % x == 0 && (y / x == 2 || y / x == 4)){
      System.out.println("Yes");
      return;
    }
    while(x > 0){
      if( 4 * x == y){
        System.out.println("Yes");
        return;
      }
      y -= 2;
      x--;
    }
    System.out.println("No");
  }
}