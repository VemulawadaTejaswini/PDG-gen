import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int acCount[] = new int[N];
    int Q = sc.nextInt();
    String S = sc.next();
    String s[] = S.split("");
    int l[] = new int[Q];
    int r[] = new int[Q];
    for (int i = 0; i < Q; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    for (int i = 0; i < N; i++) {
      if (i > 0) {
        acCount[i] = acCount[i-1];
      }
      if (i >= N-1) {
        break;
      }
      if (S.charAt(i) == 'A' && S.charAt(i+1) == 'C') {
        acCount[i] += 1;
      }
    }
    for (int i = 0; i < Q; i++) {
      int ans = acCount[r[i]-1] - acCount[l[i]-1] + 1;
      if (l[i]-1 > 0) {
        if (acCount[l[i]-1] == acCount[l[i]-2]) {
          ans--;
        }
      }
      else if (!(S.charAt(0) == 'A' && S.charAt(1) == 'C')) {
        ans--;
      }

      if (r[i] < S.length() && acCount[r[i]-2] != acCount[r[i]-1]) {
        ans--;
      }
      System.out.println(ans);
    }
    //System.out.println(Arrays.toString(acCount));
  }
}
