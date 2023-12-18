import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    StringBuilder bl = new StringBuilder();
    Scanner sc = new Scanner(System.in);

    int max = -1;
    int min = (int)Double.POSITIVE_INFINITY;
    int num = 0;
    int cost = 0;
    int a,s,cur,m;
    int n = sc.nextInt();
    int Array[] = new int[n];
    int C[] = new int[n];
    boolean bool[] = new boolean[n];

    for(int i = 0; i<n; i++){
      num = sc.nextInt();
      Array[i] = num;
      C[i] = num;
      max = Math.max(max,num);
      min = Math.min(min,num);
    }

    quicksort(C,0,n-1);


    List<Integer> Sorted = new ArrayList<Integer>();
    for(int i =0; i<n; i++){
      Sorted.add(C[i]);
    }

    for (int i = 0; i < n; i++) {
      a = 0;
      s = 0;
      cur = i;
      m = max;
      while (true) {
        bool[cur] = true;
        a++;
        int v = Array[cur];
        m = Math.min(m, v);
        s += v;
        cur = Sorted.indexOf(v);
        if (bool[cur]){
          break;
        }
      }
      int cost1 = s + (a - 2) * m;
      int cost2 = s + m + (a + 1) * min;
      cost += Math.min(cost1, cost2);
    }

    System.out.println(cost);
    //printでsort確認
    // for(int i = 0; i < n; i++){
    //   bl.append(' ').append(Array[i]);
    // }
    // bl.append("\n");
    // for(int i = 0; i < n; i++){
    //   bl.append(' ').append(C[i]);
    // }
    // bl.append("\n");
    // System.out.print(bl);

  }
  static int partition(int A[], int p, int r){
    int x = A[r];
    int i = p-1;
    int tmp;
    int s;
    for(int j =p; j<r; j++){
      if(A[j]<=x){
        i = i+1;
        tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
      }
    }
    tmp = A[i+1];
    A[i+1] = A[r];
    A[r] = tmp;
    return i+1;
  }

  static void quicksort(int A[], int p, int  r){
    if(p<r){
      int q = partition(A, p, r);
      quicksort(A, p, q-1);
      quicksort(A, q+1,r);
    }
  }
}
