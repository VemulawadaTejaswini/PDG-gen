import java.util.Arrays;
import java.util.Scanner;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;

    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();

    int x = 100*r + 10*g + b;
    if(x%4 == 0){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    
    sc.close();
  }
}
