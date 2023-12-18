import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int start = A + B;

    if (24 <= start) {
      start = start - 24;
    }

    System.out.println(start);

  }
}