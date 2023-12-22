import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int array_length = sc.nextInt();
    int[] array_to_reverse;
    array_to_reverse = new int[array_length];
    int tmp=0;
    for (int i=0; i < array_length; i++) {
      array_to_reverse[i] = sc.nextInt();
    }
    for (int k=array_length-1; k >= 0; k--) {
      if (k == 0) {
        System.out.println(array_to_reverse[k]);
      } else {
        System.out.printf("%d", array_to_reverse[k]);
        System.out.printf(" ");
      }
    }
  }
}

