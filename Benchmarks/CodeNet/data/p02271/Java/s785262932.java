import java.util.Scanner;

public class Main {
  public static int n;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int[] A = new int[n];
    for(int i=0;i<n;i++){
      A[i] = sc.nextInt(); 
    }
    int q = sc.nextInt();
    for(int i=0;i<q;i++){
      int m = sc.nextInt();
    if(solve(A, 0, m)){
        System.out.println("yes");
      }else{
        System.out.println("no");
      }
    }
  }
  public static boolean solve(int[] A, int i, int x){
    if(x == 0) return true;
    if(i >= n) return false;
    boolean res = solve(A, i+1, x) || solve(A, i+1, x-A[i]);
    return res;
  }
}

