import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String[] abc = line.split(" ");
    int a = Integer.parseInt(abc[0]);
    int b = Integer.parseInt(abc[1]);
    int c = Integer.parseInt(abc[2]);
    int i = a;
    int count = 0;
    while (i <= b) {
      if(c % i == 0) {
        count++;
      }
      i++;
    }
    System.out.println(count);
  }
}
