import java.util.*;

public class Main {
  public static void main(String[] args) {
    long m,a,r,c,h;
    m = a = r = c = h = 0;
    int[] P ={0 ,0 ,0 ,0 ,0 ,0 ,1 ,1 ,1 ,2};
    int[] Q ={1 ,1 ,1 ,2 ,2 ,3 ,2 ,2 ,3 ,3};
    int[] R ={2 ,3 ,4 ,3 ,4 ,4 ,3 ,4 ,4 ,4};
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] S = new long[5];
    for (int i = 0; i < N; i++) {
      String name = sc.next();
      if (name.charAt(0) == 'M') m++;
      if (name.charAt(0) == 'A') a++;
      if (name.charAt(0) == 'R') r++;
      if (name.charAt(0) == 'C') c++;
      if (name.charAt(0) == 'H') h++;
    }
    S[0]=m; S[1]=a; S[2]=r; S[3]=c; S[4]=h;
    long res = 0;
    for (int d = 0; d < 10; d++) {
      res += S[P[d]] * S[Q[d]] * S[R[d]];
    }

    System.out.println(res);
  }
}
