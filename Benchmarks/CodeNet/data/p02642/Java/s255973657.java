import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int N = sc.nextInt();
      int[] A = new int[N];
      int ans = 0;
       for(int i = 0; i < N; i++) A[i] = sc.nextInt();
      out:for(int i = 0; i < N; i++) {
        in:for(int j = 0; j < N; j++) {
             if(i == j)continue in;
             if(A[i] % A[j] == 0)continue out;
        }
        ans++;
      }
      System.out.println(ans);
    } 
}