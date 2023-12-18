import java.util.*;
import java.io.*;
class Main{
  static int count = 0;
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int array[] = new int[n];
    StringTokenizer token = new StringTokenizer(br.readLine());

    for(int i = 0; i<n; i++){
      array [i] = Integer.parseInt(token.nextToken());
    }

    merge_sort(array,n,0,n);
    for(int i = 0; i<n-1; i++){
      System.out.print(array[i]+" ");
    }
    System.out.println(array[n-1]);
    System.out.println(count);
  }

  static void merge(int A[], int left, int mid, int right){
    int n1 = mid - left;
    int n2 = right - mid;
    int L[] = new int[n1+1];
    int R[] = new int[n2+1];
    for(int i = 0; i<n1;i++){
      L[i] = A[left+i];
    }
    for(int i =0; i<n2; i++){
      R[i] = A[i+mid];
    }
    L[n1] = (int)Double.POSITIVE_INFINITY;
    R[n2] = (int)Double.POSITIVE_INFINITY;
    int i = 0;
    int j = 0;
    for(int k = left; k<right; k++){
      count++;
      if(L[i]<=R[j]){
        A[k] = L[i++];
      }else{
        A[k] = R[j++];
      }
    }
  }

  static void merge_sort(int A[], int n, int left, int right){
    if(left+1<right){
      int mid = (left+right)/2;
      merge_sort(A, n, left, mid);
      merge_sort(A, n, mid, right);
      merge(A, left, mid, right);
    }
  }
}
