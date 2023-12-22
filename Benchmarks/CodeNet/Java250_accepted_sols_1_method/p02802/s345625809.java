import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int M = scan.nextInt();
    int[] p = new int[M];
    String[] S = new String[M];
    for(int i=0; i<M; i++) {
      p[i] = scan.nextInt();
      S[i] = scan.next();
    }
    scan.close();

    int ok[] = new int[N];
    int pe[] = new int[N];
    for(int i=0; i<M; i++) {
      if(ok[p[i]-1] == 0) {
        if(S[i].equals("AC")) {
          ok[p[i]-1] = 1;
        }
        else if(S[i].equals("WA")) {
          pe[p[i]-1]++;
        }
      }
    }

    int okSum = 0;
    int peSum = 0;
    for(int i=0; i<N; i++) {
      okSum += ok[i];
      if(ok[i] == 1) {
        peSum += pe[i];
      }
    }

    System.out.println(okSum + " " + peSum);
  }
}