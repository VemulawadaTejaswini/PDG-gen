import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {

    new Main().run();
  }

  public void run() {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      String line = br.readLine();
      int[] arrayS =
        Stream.of(line.split(" "))
          .mapToInt(Integer::parseInt)
          .toArray();

      // OptionalInt max =
      //   Arrays.stream(arrayS).max();

      dispIntArray( countingSort(arrayS,10_000) );
    }
    catch ( IOException e ) {
      System.out.println("IOException!");
    }

  }

  public int[] countingSort(int[] a, int k) {

    int   aLength = a.length;
    int[] result  = new int[aLength];
    int[] counter = new int[k+1];

    for (int var : a) {
      counter[var]++;
    }

    for (int i=1, max=k+1; i < max; i++) {
      counter[i] += counter[i-1];
    }

    for (int i=aLength-1, val=0; i>=0; i--) {
      val = a[i];
      result[counter[val]-1] = val;
      counter[val]--;
    }

    return result;
  }

  public void dispIntArray(int[] target) {
    StringBuilder s = new StringBuilder();

    for (int i : target) { s.append(i).append(" "); }
    s.setLength(s.length()-1);

    System.out.println(s);
  }
}
