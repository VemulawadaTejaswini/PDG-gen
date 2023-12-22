import java.util.*;
import java.io.*;

public class Main{
  final static private int MAX_DATA_COUNT = 10;
  public static void main(String[] args) throws java.io.IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Integer[] mountainsHeightArr = new Integer[10];
    for (int i=0; i<MAX_DATA_COUNT; i++)
      mountainsHeightArr[i] = Integer.parseInt(br.readLine());
    Arrays.sort(mountainsHeightArr, Collections.reverseOrder());
    for (int i=0; i<3; i++)
      System.out.println(mountainsHeightArr[i]);
  }
}