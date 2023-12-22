import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] a = new int[3];
    for (int i = 0; i < 3; i++) {
      a[i] = scanner.nextInt();
    }
    Arrays.sort(a);
    System.out.println(a[0] + a[1]);
    
    
}
}