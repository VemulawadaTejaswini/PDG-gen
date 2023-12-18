import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] listStr = reader.readLine().split(" ");
    int[] list = new int[listStr.length];

    for (int i = 0; i < listStr.length; i++) {
      list[i] = Integer.parseInt(listStr[i]);
    }

    ascendingSort(list);

    System.out.println(Arrays.toString(list).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", ""));

  }

  public static void ascendingSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int tmp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = tmp;
        }
      }
    }
  }

  public static void descendingSort(int[] array) {
    for (int i = array.length - 1; i >= 0; i--) {
      for (int j = array.length - 1; j > array.length - 1 - i; j--) {
        if (array[j] > array[j - 1]) {
          int tmp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = tmp;
        }
      }
    }
  }

}