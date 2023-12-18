import java.util.Scanner;
import java.util.Arrays;
public class Main {
  public static void main (String[]args) {
    int Alice_score =0;
    int Bob_score =0;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int ai[] = new int[N];
    
    for(int i = 0; i<N; i++){
      ai[i] = sc.nextInt();
    }
    
    Arrays.sort(ai);


    for(int i = 1; i<=N; i++){
      if(i % 2 != 0){
        Alice_score += ai[N-i];
      } else {
        Bob_score += ai[N-i];
      }
    }

    System.out.println(Alice_score - Bob_score);
  }
}
