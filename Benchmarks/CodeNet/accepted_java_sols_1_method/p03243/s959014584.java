import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();

    sc.close();

    for (int i = N; i <= 999; i++) {

      if (i % 111 == 0) {
        System.out.println(i);
        break;
      }

    }

  }

}