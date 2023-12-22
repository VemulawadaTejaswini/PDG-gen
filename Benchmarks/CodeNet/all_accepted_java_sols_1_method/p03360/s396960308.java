import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[3];
    int max = 0;
    int maxInd = -1;
    for(int i = 0; i < 3; i++) {
      arr[i] = sc.nextInt();
      max = Math.max(arr[i], max);
      if(max == arr[i]) {
        maxInd = i;
      }
    }
    int K = sc.nextInt();
    arr[maxInd] *= Math.pow(2, K);
    System.out.println(arr[0] + arr[1] + arr[2]);
  }
}
