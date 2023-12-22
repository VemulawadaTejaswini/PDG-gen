import java.util.*;


public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String ans = "";
    int N = sc.nextInt();
    int[] A = new int[N];
    for(int i = 0;i < N;i++){
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    for(int i = 0;i < N-1;i++){
      if(A[i] == A[i+1]){
        ans = "NO";
        break;
      }else{
        ans = "YES";
      }
    }
    System.out.print(ans);
  }
}
