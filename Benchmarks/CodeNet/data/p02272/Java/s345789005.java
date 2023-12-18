import java.util.Scanner;

class Main{
  static int count = 0;

  static void trace(int[] a){
    int i;
    for(i = 0; i < a.length - 1; i++)
      System.out.print(a[i] + " ");
    System.out.println(a[i]);
  }

  static void merge(int[] a, int left, int mid, int right){
    int n1 = mid - left;
    int n2 = right - mid;
    int[] L = new int[n1+1];
    int[] R = new int[n2+1];

    for(int i = 0; i < n1; i++)
      L[i] = a[left + i];

    for(int i = 0; i < n2; i++)
      R[i] = a[mid + i];

    L[n1] = 1000000001;
    R[n2] = 1000000001;

    int i = 0;
    int j = 0;

    for(int k = left; k < right; k++){
      if(L[i] <= R[j])
        a[k] = L[i++];
      else
        a[k] = R[j++];
      count++;
    }
  }

  static void mergeSort(int[] a, int left, int right){
    if(left + 1 < right){
      int mid = (left + right) / 2;
      mergeSort(a, left, mid);
      mergeSort(a, mid, right);
      merge(a, left, mid, right);
    }
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int[] A = new int[n];

    for(int i = 0; i < n; i++)
      A[i] = stdIn.nextInt();

    mergeSort(A, 0, n);
    trace(A);
    System.out.println(count);
  }
}