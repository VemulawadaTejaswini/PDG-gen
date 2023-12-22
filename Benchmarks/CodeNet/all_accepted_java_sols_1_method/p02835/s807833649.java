import java.util.Scanner;

public class Main{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a1,a2,a3;
    a1 = sc.nextInt();
    a2 = sc.nextInt();
    a3 = sc.nextInt();
    if(a1+a2+a3 > 21) {
      System.out.println("bust");
    }else {
      System.out.println("win"); //System.err.println("win");から修正
    }
    sc.close();
  }
}
