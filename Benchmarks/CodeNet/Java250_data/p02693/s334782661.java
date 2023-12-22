import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int k = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
    if(a % k == 0 || b % k == 0){
      System.out.println("OK");
    }else{
      if(b/k - a/k == 0){
        System.out.println("NG");
      }else{
        System.out.println("OK");
      }
    }
  }
}