import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Frag=0;
    int[] A;
    A = new int[N];
    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
    }
    for(int i=N;i>0;i--){
      for(int j=0;j<i-1;j++){
        if(A[j]>A[j+1]){
          int ch =A[j];
          A[j]=A[j+1];
          A[j+1]=ch;
          Frag++;
        }
      }
    }
    System.out.printf("%d",A[0]);
    for(int i=1;i<N;i++){
      System.out.printf(" %d",A[i]);
    }
    System.out.println("\n"+ Frag);
    sc.close();
  }
}
