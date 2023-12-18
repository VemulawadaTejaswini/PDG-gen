import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int[] H = new int[N];
    boolean[] judge = new boolean[N];
    for(int i=0; i<N; i++) {
      H[i] = scan.nextInt();
      judge[i] = true;
    }
    for(int i=0; i<M; i++) {
      int A = scan.nextInt();
      int B = scan.nextInt();
      if(H[A-1] < H[B-1]) {
        judge[A-1] = false;
      }
      if(H[A-1] == H[B-1]) {
        judge[A-1] = false;
        judge[B-1] = false;
      }
      if(H[A-1] > H[B-1]) {
        judge[B-1] = false;
      }
    }
    scan.close();

    int count = 0;
    for(int i=0; i<N; i++) {
      if(judge[i]) {
        count++;
      }
    }
    System.out.println(count);
  }
}