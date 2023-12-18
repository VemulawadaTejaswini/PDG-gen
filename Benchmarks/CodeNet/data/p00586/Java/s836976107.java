import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = 0;
    int b = 0;
    while (sc.hasNextLine()) {
      a = sc.nextInt();
      b = sc.nextInt();
      System.out.println(a + b);
    }
    System.exit(0);
  }

}

