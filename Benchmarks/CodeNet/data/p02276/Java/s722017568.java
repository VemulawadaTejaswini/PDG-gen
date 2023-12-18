import java.io.*;

public class Main
{
  public static void main(String[] args) {
    try{
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      String[] arr = in.readLine().split(" ");
      int[] A = new int[n];
      for(int i=0; i<n; i++) {
        A[i] = Integer.parseInt(arr[i]);
      }
      int partitionId = partition(A, 0, n-1);
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<n; i++) {
        if(i == partitionId) {
          sb.append("[").append(A[i]).append("] ");
        } else if(i == n-1) {
          sb.append(A[i]);
        } else {
          sb.append(A[i]).append(" ");
        }
      }
      System.out.println(sb.toString());
    } catch (IOException e) {}

  }

  public static int partition(int[] A, int p, int r) {
    int x = A[r];
    int i = p - 1;
    for(int j = p; j < r; j++) {
      if(A[j] <= x) {
        i++;
        int tmp = A[j];
        A[j] = A[i];
        A[i] = tmp;
      }
    }
    A[r] = A[i+1];
    A[i+1] = x;
    return i+1;
  }

}