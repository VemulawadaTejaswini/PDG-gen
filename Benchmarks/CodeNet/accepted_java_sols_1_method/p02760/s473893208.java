import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long[][] A = new long[3][3];
    for(int i=0; i<3; i++) {
      for(int j=0; j<3; j++) {
        A[i][j] = scan.nextInt();
      }
    }
    int N = scan.nextInt();
    long[] b = new long[N];
    for(int k=0; k<N; k++) {
      b[k] = scan.nextInt();
    }
    scan.close();

    int[] Bi = new int[3];
    int[] Bj = new int[3];
    int lt = 0;
    int rt = 0;
    for(int k=0; k<N; k++) {
      for(int i=0; i<3; i++) {
        for(int j=0; j<3; j++) {
          if(b[k] == A[i][j]) {
            Bi[i]++;
            if(Bi[i] == 3) {
              System.out.println("Yes");
              return;
            }

            Bj[j]++;
            if(Bj[j] == 3) {
              System.out.println("Yes");
              return;
            }

            if(i == j) {
              lt++;
            }
            if(lt == 3) {
              System.out.println("Yes");
              return;
            }

            if(i + j == 2) {
              rt++;
            }
            if(rt == 3) {
              System.out.println("Yes");
              return;
            }
          }
        }
      }
    }

    System.out.println("No");
  }
}