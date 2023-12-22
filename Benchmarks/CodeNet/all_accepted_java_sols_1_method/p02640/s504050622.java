import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int y = sc.nextInt();
    int ax2 = 4*x - y;
    int bx2 = -2 * x + y;

    if((ax2 % 2) == 0 && (bx2 % 2) == 0 && ax2 >= 0 && bx2 >= 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
    return;
  }
}