import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Main{

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] oneLine = br.readLine().split(" ", 0);
    int[] nl = Stream.of(oneLine).mapToInt(x -> Integer.valueOf(x)).toArray();
    String[] tList = new String[nl[0]];

    for(int i =0; i < nl[0]; i++){
      tList[i] = br.readLine();
    }

    Arrays.sort(tList);
    String result = Arrays.stream(tList).reduce("", (seed, value) -> seed + value);

    System.out.println(result);


  }
}
