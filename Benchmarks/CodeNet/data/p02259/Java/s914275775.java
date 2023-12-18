import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    int m, n=0;
    for(int i=0;i<A.length;i++){
      A[i] = sc.nextInt();
    }
    for(int i=N;i>=2;i--){
      for(int j=0;j<i-1;j++){
        if(A[j]>A[j+1]){
          m = A[j];
          A[j] = A[j+1];
          A[j+1] = m;
          n++;
        }
      }
    }
    for(int i=0;i<N;i++){
      if(i<N-1){
        System.out.print(A[i] + " ");
      }else{
        System.out.print(A[i]);
      }
    }
    System.out.println();
    System.out.println(n);
  }
}
