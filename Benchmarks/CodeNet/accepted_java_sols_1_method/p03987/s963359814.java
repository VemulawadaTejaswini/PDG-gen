import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n+1];
      for(int i = 1; i <= n; i++)
        arr[sc.nextInt()] = i;
      TreeSet<Integer> idxTree = new TreeSet<>();
      long sum = 0L;
      for(int i = 1; i <= n; i++) { // value
        int idx = arr[i];
        Integer left = idxTree.lower(idx);
        Integer right = idxTree.higher(idx);
        if(left == null)
          left = 0;
        if(right == null)
          right = n + 1;
        idxTree.add(idx);
        sum += (long)(idx - left) * (long)(right - idx) * i;
      }
      System.out.println(sum);
  }
}