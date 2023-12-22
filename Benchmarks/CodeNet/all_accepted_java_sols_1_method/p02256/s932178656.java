import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int tmp = 0;
    int r = 0;
    
    if (a < b) {
      tmp = a;
      a = b;
      b = tmp;
    }
    
    while (b > 0) {
      r = a % b;
      a = b;
      b = r;
    }
    
    System.out.println(a);
  }
}

