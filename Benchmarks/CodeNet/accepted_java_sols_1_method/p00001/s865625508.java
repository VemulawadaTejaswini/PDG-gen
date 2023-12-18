import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] h = new int[10];
    
    for (int i = 0; i < 10; i ++) {
      h[i] = input.nextInt();
      int j = i;
      while (j > 0 && h[j] > h[j - 1]) {
        int t = h[j];
        h[j] = h[j - 1];
        h[j - 1] = t;
        j --;
      }
    }
    
    for (int i = 0; i < 3; i ++)
      System.out.println(h[i]);
  }

}