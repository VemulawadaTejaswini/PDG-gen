import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int[] array = new int[3];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++)
      array[i] = sc.nextInt();

    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        if (array[i] < array[j]) {
          int tmp;
          tmp = array[i];
          array[i] = array[j];
          array[j] = tmp;
        }
    System.out.println(array[0] + " " + array[1] + " " + array[2]);
  }
}