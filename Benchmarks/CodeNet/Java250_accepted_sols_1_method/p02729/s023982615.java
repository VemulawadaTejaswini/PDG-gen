import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int cnt = 0;
    for(int i=0; i<N-1; i++){
      for(int j=i+1; j<N; j++){
        cnt++;
      }
    }
    for(int i=0; i<M-1; i++){
      for(int j=i+1; j<M; j++){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}