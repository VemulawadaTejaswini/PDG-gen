import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(), M = sc.nextInt();
    int arr[] = new int[M];
    for(int i = 0; i<M; i++){
      arr[i] = sc.nextInt(); 
    }
    Arrays.sort(arr);
    int dif[] = new int[M-1];
    for(int i = 0; i<M-1; i++){
      dif[i] = arr[i+1] - arr[i];
    }
    Arrays.sort(dif);
    int ans = arr[M-1] - arr[0];
    for(int i = M-2; i>M-2-N+1 && i >= 0; i--){
      //System.out.println(dif[i]);
      ans -= dif[i];
    }
    System.out.println(ans);
  }
}