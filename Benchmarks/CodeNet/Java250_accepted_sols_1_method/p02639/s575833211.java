import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int[] A = new int[5];
      for(int i = 0; i < 5; i++) A[i] =sc.nextInt();
      int ans = 1;
      for(int i = 0; i < 5; i++){
        if(A[i] == 0) ans +=i;
      }
      System.out.println(ans);
    } 
}