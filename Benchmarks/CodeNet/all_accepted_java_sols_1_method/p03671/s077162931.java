import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] data = {a+b,b+c,c+a};
    int min = data[0];

    for (int i = 0; i < 3; i++) {
      min = Math.min(data[i],min);
    }

    System.out.println(min);
  }

}
