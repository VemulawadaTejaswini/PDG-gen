import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int[] arr = new int[5];

    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
    }

    int k = sc.nextInt();
    
    String result = "Yay!";

    loop: for (int i = 0; i < 5; i++) {
      for (int j = i + 1; j < 5; j++) {
        if (k < (arr[j] - arr[i])) {
          result = ":(";
          break loop;
        }
      }
    }

    System.out.println(result);

  }
}