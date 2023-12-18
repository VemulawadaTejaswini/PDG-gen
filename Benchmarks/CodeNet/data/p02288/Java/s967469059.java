import java.util.*;
import java.io.*;

class Main{
  static int n = 0;
  public static void main(String args[]){

    StringBuilder build = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    int A[] = new int[n+1];

    for(int i = 1; i<n+1; i++){
      A[i]  = sc.nextInt();
    }

    buildMaxHeap(A);

    for(int i = 1; i<n+1; i++){
      System.out.print(" "+A[i]);
    }
    System.out.println("");

  }

  static void maxHeapify(int A[], int i ){
    int l =i*2;
    int r = i*2+1;
    int largest = 0;
    int tmp;

    if(l<=n && A[l] > A[i]) largest = l;
    else largest = i;

    if(r<=n && A[r] > A[largest] ) largest = r;

    if(largest != i){
      tmp = A[i];
      A[i] = A[largest];
      A[largest] = tmp;
      maxHeapify(A, largest);
    }
  }

  static void buildMaxHeap(int []A){
    for(int i = n/2; i>0; i--){
      maxHeapify(A,i);
    }
  }

}

