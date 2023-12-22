import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = input.nextInt();
    }

    if (n == 1) {
      System.out.println("Yes");
      return;
    }

    else {
      for (int i = 1; i < n; i++) {

        if (array[i] < array[i - 1]) {
          System.out.println("No");
          return;

        } else if (array[i] > array[i - 1]) {
          array[i] = array[i] - 1;
        }
      }
    }
    System.out.println("Yes");
  }



}


