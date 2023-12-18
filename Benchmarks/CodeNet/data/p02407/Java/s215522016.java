import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int A[] = new int[100];
    int i,N;

    N = scanner.nextInt();

    for(i=0;i<N;i++){
      A[i] = scanner.nextInt();
    }

    for(i=N-1;i>=0;i--){
      System.out.print(A[i]);
      if(i!=0)System.out.print(" ");
    }

    System.out.print("\n");

  }
}

