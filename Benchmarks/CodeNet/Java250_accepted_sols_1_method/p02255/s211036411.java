import java.util.*;

class Main{
  public static void main(String args[]){

    int i= 0;
    int key = 0;
    int n = 0;

    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int A [] = new int[n];
    //input
    for(int k = 0; k<n; k++){
      A[k] = sc.nextInt();
    }

    //insertion sort
    for(int j = 1; j<A.length;j++){
      key = A[j];
      i = j -1;
      for(int k = 0; k<A.length-1;k++){
        System.out.printf("%d ", A[k]);
      }
      System.out.printf("%d\n",A[A.length-1]);

      while(i>=0 && A[i]>key){
        A[i+1] = A[i];
        i--;
      }
      A[i+1] = key;
    }

    //output
    for(int k = 0; k<A.length-1;k++){
      System.out.printf("%d ", A[k]);
    }
    System.out.printf("%d\n",A[A.length-1]);

  }
}
