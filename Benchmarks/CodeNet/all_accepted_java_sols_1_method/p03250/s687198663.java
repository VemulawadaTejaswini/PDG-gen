import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int data[] = new int[3];

    for (int i = 0 ; i < 3 ; i++ ) {
      data[i] = sc.nextInt();
    }

    Arrays.sort(data);

    int n = data[2] * 10 + data[1];

    System.out.println(n + data[0]);
  }
}
