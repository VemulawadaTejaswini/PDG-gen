import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];

      int minIdx = 0; 
      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        if(arr[minIdx] > arr[i]){
          minIdx = i;
        } 
      }

      int nextMinIdx = minIdx;
      minIdx = -1;
      while(minIdx != nextMinIdx) {
        minIdx = nextMinIdx;
        for(int i = 0; i < arr.length; i++) {
          if(i == minIdx) continue;
          arr[i] = arr[i] % arr[minIdx];
          if(arr[i] == 1) {
              System.out.println(1);
              return;
          }
          if(arr[nextMinIdx] > arr[i] && arr[i] != 0) {
            nextMinIdx = i;
          }
        }
      }
      System.out.println(arr[minIdx]);
  }
}