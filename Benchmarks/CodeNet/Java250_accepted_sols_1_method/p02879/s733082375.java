import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 0;
    if(a > 9 || b > 9){
      System.out.println(-1);
      System.exit(0);
    }
    c = a * b;
    System.out.println(c);
  }
}