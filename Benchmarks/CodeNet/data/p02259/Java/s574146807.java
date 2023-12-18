/* ALDS1_2_A */
import java.io.*;

class Main
{
  public static void main(String[] args)
  {
    try{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int n = Integer.parseInt(br.readLine());
      int[] array = new int[n];
      String[] str = br.readLine().split(" ");

      for(int i = 0; i < n; i++){
        array[i] = Integer.parseInt(str[i]);
      }

      BubbleSort bs = new BubbleSort();
      bs.bubbleSort(array, n);

      for(int i = 0; i < n ; i++){
        sb.append(array[i]).append(" ");
      }
      sb.deleteCharAt(sb.length() - 1);
      sb.append("\n");
      sb.append(bs.getCount());

      System.out.println(sb);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}

class BubbleSort
{
  private static int changeCount;

  public void bubbleSort(int[] A, int N)
  {
    changeCount = 0;
    boolean flag = true;
    int i = 0;

    while(flag){
      flag = false;
      for(int j = N-1; j > i; j--){
        if(A[j] < A[j-1]){
          int tmp = A[j];
          A[j] = A[j-1];
          A[j-1] = tmp;
          flag = true;
          changeCount++;
        }
      }
      i++;
    }
  }

  public int getCount()
  {
    return changeCount;
  }
}