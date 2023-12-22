import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int[] n = new int[num];

    for (int i = 0; i < num; i++){
      int s = scan.nextInt();
      n[s - 1] = i;
    }
    for(int i = 0; i < num; i++){
      System.out.print(n[i] + 1 + " ");

    }
  }
}
