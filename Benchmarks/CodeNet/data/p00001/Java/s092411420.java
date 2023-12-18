import java.util.Arrays;
public class Main{
  public static void main(String[] args) {
    int[] arr = {1819,2003,876,2840,1723,1673,3776,2848,1592,922};
    Arrays.sort(arr);
    for(int i = 9; i > 6; i--) {
      System.out.println(arr[i]);
    }
  }
}