import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int x = scan.nextInt();
    int t = scan.nextInt();
    if (n%x == 0){
      System.out.println(n/x*t);
    }else{
      System.out.println((n/x+1)*t);
    }
  }
}
