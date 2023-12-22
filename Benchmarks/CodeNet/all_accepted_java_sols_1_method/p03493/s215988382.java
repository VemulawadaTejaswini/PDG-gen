import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    char[] zeroOne = line.toCharArray();
    int count = 0;
    for (int i = 0; i < 3; i++) {
      if (zeroOne[i] == '1') {
        count++;
      }
    }
    System.out.println(count);
  }
}