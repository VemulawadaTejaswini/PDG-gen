import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] ab = line.split(" ");
    int a = Integer.parseInt(ab[0]);
    int b = Integer.parseInt(ab[1]);
    int c = Integer.parseInt(ab[2]);
    if(a < b && b < c) {
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }

  }
}

