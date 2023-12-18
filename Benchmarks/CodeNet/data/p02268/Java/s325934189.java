import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] s = Arrays
        .asList(br.readLine().split(" "))
        .stream()
        .mapToInt(i->Integer.valueOf(i))
        .toArray();

    int q = Integer.parseInt(br.readLine());
    int[] t = Arrays
        .asList(br.readLine().split(" "))
        .stream()
        .mapToInt(i->Integer.valueOf(i))
        .toArray();

    long count = Arrays.stream(t).filter(x -> binarySearch(s, x)).count();
    System.out.println(count);
  }

  private static boolean binarySearch(int[] arr, int searchNum) {
    int mid = arr.length / 2;
    if (arr[mid] == searchNum) {
      return true;
    } else if (arr.length <= 1) {
      return false;
    } else if (arr[mid] > searchNum) {
      int[] nextArr = Arrays.copyOfRange(arr, 0, mid);
      return binarySearch(nextArr, searchNum);
    } else {
      int[] nextArr = Arrays.copyOfRange(arr, mid, arr.length);
      return binarySearch(nextArr, searchNum);
    }
  }
}