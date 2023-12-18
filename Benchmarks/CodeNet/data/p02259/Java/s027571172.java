import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A[] = new int[100];
    int X,N,C=0;

    N = scanner.nextInt();

    for(int i=0;i<N;i++){
      A[i] = scanner.nextInt();
    }

    for(int k=0;k<N;k++){
      for(int i=N-1;i>=1;i--){
        if(A[i]<A[i-1]){
          X = A[i];
          A[i] = A[i-1];
          A[i-1] = X;
          C++;
        }
      }
    }

    for(int i=0;i<N;i++){
      System.out.print(A[i]);
      if(i!=N-1){
        System.out.print(" ");
      }
    }
    System.out.print("\n" + C + "\n");
  }
}

