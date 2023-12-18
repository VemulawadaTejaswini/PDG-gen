import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    if(1<=n && n<=9){
      System.out.println(n*n*n);
    }
  }
}
