import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] list = new long[n];
    for(int i = 0; i < n; i++) {
      int j = sc.nextInt();
      list[i] = j;
    }
    sc.close();
    List<Long> result = new ArrayList<Long>();


    result.add(getMin(list));
    result.add(getMax(list));
    result.add(getSum(list));
    System.out.println(result.get(0) + " " + result.get(1) + " " + result.get(2));
  }

  public static long getMax(long[] list) {
    long max = list[0];
    for(int i = 0; i < list.length; i++) {
      if(max < list[i]) {
        max = list[i];
      }
    }
    return max;
  }

  public static long getMin(long[] list) {
    long min = list[0];
    for(int i = 0; i < list.length; i++) {
      if(min > list[i]) {
        min = list[i];
      }
    }
    return min;
  }

  public static long getSum(long[] list) {
    long sum = 0;
    for(int i = 0; i < list.length; i++) {
      sum += list[i];
    }
    return sum;
  }
}
