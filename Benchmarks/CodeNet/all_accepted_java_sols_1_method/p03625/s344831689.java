import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int[] arr = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] =  sc.nextInt();
      Arrays.sort(arr);
      long h = 0;
      long w = 0;
      int i = arr.length - 1;
      for(; i > 0; i--) {
        if(arr[i] == arr[i-1]) {
            h = arr[i];
            i-=2;
            break;
        }
      } 
      for(; i > 0; i--) {
        if(arr[i] == arr[i-1]) {
            w = arr[i];
            break;
        }
      }
      System.out.println(h*w);
  }
}
