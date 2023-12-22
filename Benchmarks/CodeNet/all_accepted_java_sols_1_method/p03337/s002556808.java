import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int data[] = new int[3];
    int max = -1000;

    for (int i = 0 ; i < 3 ; i++ ) {
      if (i == 0) {
        data[i] = a+b ;
      }
      if (i == 1) {
        data[i] = a-b ;
      }
      if (i == 2) {
        data[i] = a*b ;
      }
    }

    for (int i = 0 ; i < 3 ; i++ ) {
      max = Math.max(data[i], max);
    }
    System.out.println(max);
  }
}
