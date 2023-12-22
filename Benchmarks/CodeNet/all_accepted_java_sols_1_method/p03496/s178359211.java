import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      int minIdx = 0, maxIdx = 0;

      for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        if(arr[i] < min) {
          min = arr[i];
          minIdx = i;
        }
        if(arr[i] > max) {
          max = arr[i];
          maxIdx = i;
        }
      }
	  System.out.println(2*n-1);
      if(min < 0 && Math.abs(min) > Math.abs(max)) { // neg
        for(int i = 0; i < n; i++) {
          arr[i] += min;
          System.out.println((minIdx+1) + " " + (i+1));
        }
        for(int i = n-1; i >= 1; i--) {
          arr[i-1] += arr[i];
          System.out.println((i+1) + " " + i);
        }
      } else {
        for(int i = 0; i < n; i++) {
          arr[i] += max;
          System.out.println((maxIdx+1) + " " + (i+1));
        }
        for(int i = 1; i < n; i++) {
          arr[i] += arr[i-1];
          System.out.println(i + " " + (i+1));
        }
      }
  }
}
