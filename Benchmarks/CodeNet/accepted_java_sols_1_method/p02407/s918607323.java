import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n];

    for(int i=0;i<n;i++){
      A[i]= sc.nextInt();
    }
    for(int j=n-1;j>0;j--){
      System.out.print(A[j] + " ");
    }
    System.out.println(A[0]);
    sc.close();
  }
}
