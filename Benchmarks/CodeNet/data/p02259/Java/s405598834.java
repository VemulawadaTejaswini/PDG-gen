import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }

    int count = 0;
    int tmp;
    for (int i = 0; i < size; i++) {
      for (int j = size - 1; j > i; j--) {
        if (array[j] < array[j-1]) {
          tmp = array[j-1];
          array[j-1] = array[j];
          array[j] = tmp;
          count++;
        }
      }
    }

    for (int i = 0; i < size - 1; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println(array[size - 1]);
    System.out.println(count);
  }
}

