import java.util.Scanner;

public class Main {
  public static void main(String... args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int[] array = new int[num];

      for (int i = 0; i < num; i++) {
          array[i] = sc.nextInt();
      }

      print(array);
      for (int i = 1; i < array.length; i++) {
          int key = array[i];
          int j = i - 1;
          while (j >= 0 && array[j] > key) {
              array[j+1] = array[j];
              j--;
          }
          array[j+1] = key;
          print(array);
      }

  }

  public static void print(int[] array) {
      for (int i = 0 ; i < array.length - 1; i++) {
          System.out.print(array[i] + " ");
      }
      System.out.println(array[array.length-1]);
  }
}
