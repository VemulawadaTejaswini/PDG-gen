import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int count5 = 0;
    int count7 = 0;

    int[] data = {a,b,c};

    for (int i = 0; i < 3; i++) {
      if (data[i] == 5) count5++;
      if (data[i] == 7) count7++;
    }
    if (count5 == 2 && count7 == 1) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }

}
