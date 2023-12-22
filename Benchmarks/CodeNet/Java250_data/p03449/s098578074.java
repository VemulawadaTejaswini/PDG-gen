import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A1 = new int[N];
    int[] A2 = new int[N];
    for (int i =0; i<N; i++) {
      A1[i] = sc.nextInt();
    }
    for (int i =0; i<N; i++) {
      A2[i] = sc.nextInt();
    }
    int max =0;
    for (int k =0; k<N; k++) { //2行目に行くタイミング
      int ans =0;
      for (int i =k; i<N; i++) {
        ans += A2[i];
      }
      for (int j =0; j<=k; j++) {
        ans += A1[j];
      }
      max = Math.max(ans,max);
    }
    System.out.println(max);  
  }
}    