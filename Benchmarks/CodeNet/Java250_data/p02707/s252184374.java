import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int A[] = new int[N];
    A[0] = 0;
    for(int i = 1;i < N;i++){
      A[i] = scanner.nextInt();
    }
    int B[] = new int[N];
    for(int i = 1;i < N;i++){
      B[A[i] - 1]++;
    }
    for(int i = 0;i < N;i++){
      System.out.println(B[i] +  "\n");
    }
  }
}