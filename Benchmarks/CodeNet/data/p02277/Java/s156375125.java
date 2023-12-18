import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[])throws Exception{
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    StringBuilder bl = new StringBuilder();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int A[] = new int[n];
    int B[] = new int[n];
    String C[] = new String[n];
    String D[] = new String[n];
    String S[];

    for(int i = 0; i<n; i++){
      // A[i] = sc.nextInt();
      S = br.readLine().split("\\s+");
      C[i] = S[0];
      A[i] = Integer.parseInt(S[1]);
      B[i] = A[i];
      D[i] = C[i];
    }

    quicksort(A,C,0,A.length-1);
    mergesort(B,D, n, 0, B.length);

    //安定性の判定
    int j = 0;
    int flag = 0;
    while(j<n){
      if(D[j]!=C[j]){
        System.out.println("Not stable");
        break;
      }
      j++;
    }
    if(j==n)System.out.println("Stable");

    //出力
    for(int i = 0; i < n; i++){
      bl.append(C[i]).append(' ').append(A[i]).append("\n");
    }
    System.out.print(bl);
  }
  static int partition(int A[],String C[], int p, int r){
    int x = A[r];
    int i = p-1;
    int tmp;
    String s;
    for(int j =p; j<r; j++){
      if(A[j]<=x){
        i = i+1;
        tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
        s = C[i];
        C[i] = C[j];
        C[j] = s;
      }
    }
    tmp = A[i+1];
    A[i+1] = A[r];
    A[r] = tmp;
    s = C[i+1];
    C[i+1] = C[r];
    C[r] = s;
    return i+1;
  }

  static void quicksort(int A[], String C[], int p, int  r){
    if(p<r){
      int q = partition(A, C, p, r);
      quicksort(A, C, p, q-1);
      quicksort(A, C, q+1,r);
    }
  }


  //mergesortと比較
  static void merge(int A[],String S[], int left, int mid, int right){
    int n1 = mid - left;
    int n2 = right - mid;
    int L[] = new int[n1+1];
    int R[] = new int[n2+1];
    String Ls[] = new String[n1+1];
    String Rs[] = new String[n2+1];
    for(int i = 0; i<n1;i++){
      L[i] = A[left+i];
            Ls[i] = S[left+i];
    }
    for(int i =0; i<n2; i++){
      R[i] = A[i+mid];
      Rs[i] = S[i+mid];
    }
    L[n1] = (int)Double.POSITIVE_INFINITY;
    R[n2] = (int)Double.POSITIVE_INFINITY;
    int i = 0;
    int j = 0;
    for(int k = left; k<right; k++){
      if(L[i]<=R[j]){
        A[k] = L[i];
        S[k] = Ls[i++];
      }else{
        A[k] = R[j];
        S[k] = Rs[j++];
      }
    }
  }

  static void mergesort(int A[],String S[], int n, int left, int right){
    if(left+1<right){
      int mid = (left+right)/2;
      mergesort(A,S, n, left, mid);
      mergesort(A,S, n, mid, right);
      merge(A,S, left, mid, right);
    }
  }
}
