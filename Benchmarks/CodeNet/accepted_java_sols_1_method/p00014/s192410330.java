import java.util.Scanner;
 
public class Main {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  while (in.hasNext()) {
    int d = in.nextInt();
    int val = 0;
    int x;
    for (int i = 1; (x = i * d) < 600; i++) {
      val += d * x * x;
    }
    System.out.println(val);
  }
}
}
