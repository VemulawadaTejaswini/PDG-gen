import java.io.*;
import java.util.*;

class Main{
  static int n;
  static int[] A = new int[2000000];
  static int[] B = new int[1000000];

  public static void main(String[] args){
    int key;
    Scanner scan = new Scanner(System.in);
    String s;
    int j = 0;

    while(true){
      s = scan.next();
      if(s.equals("end")){break;}

      if(s.equals("insert")){
        key = scan.nextInt();
        insert(key);
      }
      else{
        B[j] = func();
        j++;
      }
    }
    for(int i=0 ; i<j ; i++){
      System.out.println(B[i]);
    }
  }

  public static void maxHeapify(int i){
    int l = 2 * i;
    int r = 2 * i + 1;
    int L;
    int tmp;

    if(l <= n && A[l] > A[i]){L = l;}
    else{L = i;}

    if(r <= n && A[r] > A[L]){L = r;}

    if(L != i){
      tmp = A[i];
      A[i] = A[L];
      A[L] = tmp;
      maxHeapify(L);
    }
  }

    public static int func(){
      int max;

      if(n<1){return -10000000;}

      max = A[1];
      A[1] = A[n--];
      maxHeapify(1);
      return max;
    }

    public static void insert(int key){
      n++;
      A[n] = -1000000;
      increase(n, key);
    }

    public static void increase(int i, int key){
      int tmp;
      if(key < A[i]){return;}

      A[i] = key;
      while(i > 1 && A[i/2] < A[i]){
        tmp = A[i];
        A[i] = A[i/2];
        A[i/2] = tmp;
        i /= 2;
      }
    }

}

