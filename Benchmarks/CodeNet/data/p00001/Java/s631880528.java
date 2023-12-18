import java.util.*;
class Main{
    public static void main(String[] a){
      int n = 10;
      int[] num = new int[n];

      Scanner stdin = new Scanner(System.in);
      for ( int i = 0; i < n; i++ ){
        num[i] = stdin.nextInt();
      }

      quicksort(num, 0, n-1);

      for ( int i = 0; i < 4; i++ ){
        System.out.println(num[i]);
      }

    }

    public static void quicksort(int[] num, int left, int right){
      if ( left < right ){
        int pivot_index = partition(num, left, right);
        quicksort(num, left, pivot_index-1);
        quicksort(num, pivot_index+1, right);
      }
    }

    public static int partition(int[] num, int left, int right){
      int k = (left + right) / 2;

      swap(num[k], num[right]);

      int i = left;
      int j = right;
      while( i < j ){
        while( num[i] < num[right] ){
           i++;
        }
        while( num[j] >= num[right] && j >= i ){
          j++;
        }
        if ( i < j ){
          swap(num[i], num[j]);
        }
      }
      swap(num[i], num[right]);
      return i;
    }

    public static void swap(int a, int b){
      int tmp;
      tmp = a;
      a = b;
      b = tmp;
    }
}