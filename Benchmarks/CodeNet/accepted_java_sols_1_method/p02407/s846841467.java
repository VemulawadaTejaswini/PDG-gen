import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder s = new StringBuilder();
    
    int n = in.nextInt();
    int[] array = new int[n];
    
    for (int i = n - 1; i >= 0; i--) {
      array[i] = in.nextInt();
    }
    
    for (int i = 0; i < n; i++) {
      s.append(array[i]);
      if (i != n - 1) s.append(" ");
    }
    System.out.println(s.toString());
  }
}