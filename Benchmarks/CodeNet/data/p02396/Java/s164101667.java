import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int c = 1;
    while(true)
    {
      int x = scan.nextInt();
      if (x==0) break;
      System.out.println("Case "+ c + ": " + x);
      c++;
    }
    scan.close();
  }
}
