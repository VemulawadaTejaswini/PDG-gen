import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] L = new int[N];
    for (int i = 0; i < N; i++) L[i] = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < N; i++) {
      for (int j = i; j < N; j++) {
        if (L[i] == L[j]) continue;
        for (int k = j; k < N; k++) {
          if (L[i] == L[k] || L[j] == L[k]) continue;
          if (isTriangle(L[i], L[j], L[k])) {
            ans++;
            //System.out.printf("%d %d %d\n",L[i],L[j],L[k]);
          }
        }
      }
    }
    System.out.println(ans);
  }
  
  static boolean isTriangle(int a, int b, int c) {
    //System.out.printf("tri %d %d %d\n", a, b, c);
    if (a<(b+c) && b<(a+c) && c<(a+b)) return true;
    return false;
  }
}