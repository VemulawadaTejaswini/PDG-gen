/* ALDS1_2_B */
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
      SelectionSort ss = new SelectionSort();

      for(int i = 0; i < n; i++){
        array[i] = Integer.parseInt(str[i]);
      }

      ss.selectionSort(array);
      ss.showArray(array);
      System.out.println(ss.getSwap());

    }catch(Exception e){
      System.out.println(e);
    }
  }
}

class SelectionSort
{
  private int swap;

  public void selectionSort(int[] A)
  {
    swap = 0;

    for(int i = 0; i < A.length; i++){
      int mini = i;
      for(int j = i; j < A.length; j++){
        if(A[j] < A[mini]) mini = j;
      }
      if(i != mini){
        int tmp = A[i];
        A[i] =  A[mini];
        A[mini] = tmp;
        swap++;
      }
    }
  }

  public void showArray(int[] A)
  {
    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < A.length; i++){
      sb.append(A[i]).append(" ");
    }
    sb.deleteCharAt(sb.length() - 1);
    System.out.println(sb);
  }

  public int getSwap() { return swap; }
}