import java.util.*;
  public class Main {
    public static void main(String[] args) {
     
        //sec--1 (definition)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long cal = 1;
        long max = (long)Math.pow(10,18);
      
        //sec--2 (loop,0)
        for(int i=0; i<N; i++){
          A[i] = sc.nextLong();
          if(A[i]==0){
            System.out.println(0);
            return;
          }
        }
      
        //sec--3 (loop,-1.cal)
        //returnで初期に戻るので
        if(cal != 0) {
        for(int i=0; i<N; i++){
          if(max/cal < A[i]){
            System.out.println(-1);
            return;
          } else {
            cal *= A[i];
          }
        }
        }
            System.out.println(cal);
            return;
    }
  }