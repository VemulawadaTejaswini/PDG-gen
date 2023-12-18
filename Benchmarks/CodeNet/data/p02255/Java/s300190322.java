/* ALDS1_1_A */
import java.io.*;

class Main
{

  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int[] array = new int[n];

      for(int i = 0; i < n; i++){
        array[i] = Integer.parseInt(str[i]);
      }
      insertionSort(array, array.length);

    }catch(Exception e){
      System.out.println(e);
    }
  }

  public static void insertionSort(int[] A, int N)
  {
    StringBuilder sb = new StringBuilder();
    sb.append(show(A));

    for(int i = 1; i < N; i++){
      int v = A[i];
      int j = i - 1;
      while(j >= 0 && A[j] > v){
        A[j+1] = A[j];
        j--;
      }
      A[j+1] = v;
      sb.append(show(A));
    }
    System.out.print(sb);
  }

  public static String show(int[] B)
  {
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < B.length; i++){
      sb.append(B[i]).append(" ");
    }
    sb.deleteCharAt(sb.length() - 1);
    sb.append("\n");

    return sb.toString();
  }
}