import java.util.Arrays;
import java.util.Scanner;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;

    int n = sc.nextInt();
    int a = sc.nextInt();
    boolean check = true;
    if(n%500 <= a){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }
}
