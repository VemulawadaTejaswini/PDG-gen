
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String readStr;

    String[] strs = reader.readLine().split(" ");
    int[] list = new int[strs.length];
    for (int i = 0; i < strs.length; i++)
      list[i] = Integer.parseInt(strs[i]);

    sort(list);
    for (int i = 0; i < list.length - 1; i++)
      System.out.print(list[i] + " ");
    System.out.println(list[list.length - 1]);
  }

  public static void sort(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1; j++) {
        if (array[j] < array[j + 1]) {
          int stack = array[j];
          array[j] = array[j + 1];
          array[j + 1] = stack;
        }
      }
    }
  }

}