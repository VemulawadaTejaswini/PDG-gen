import java.util.Scanner;

public class Main{
    static int[] A,L,R;
    static int N,Q;
    static String str;
    static int ans;
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      N = sc.nextInt();
      Q = sc.nextInt();
      str = sc.next();
      A = new int[N];
      R = new int[Q];
      L = new int[Q];
      for(int i=0;i<Q;i++){
        L[i]=sc.nextInt();
        R[i]=sc.nextInt();
      }
      A[0]=0;
      if(str.charAt(0)=='A' && str.charAt(1)=='C'){
        A[1]=1;
      }
      else{
        A[1]=0;
      }
      for(int i=2;i<N;i++){
        if(str.charAt(i-1)=='A' && str.charAt(i)=='C'){
          A[i]=A[i-1]+1;
        }
        else{
          A[i]=A[i-1];
        }
      }
      for(int i=0;i<Q;i++){
        ans = A[R[i]-1]-A[L[i]-1];
        System.out.println(ans);
      }
    }

}