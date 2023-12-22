import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    if(str.endsWith("3")) {
      System.out.println("bon");
    }else if(str.endsWith("0")||str.endsWith("1")||str.endsWith("6")||str.endsWith("8")) {
      System.out.println("pon");
    }else {
      System.out.println("hon");
    }

  }

}
