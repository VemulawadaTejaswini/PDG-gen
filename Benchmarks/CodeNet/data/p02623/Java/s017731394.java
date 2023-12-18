import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    sc.nextLine();
    int[] A = Arrays.stream(sc.nextLine().split(" "))
      .mapToInt(Integer::parseInt).toArray();
    int[] B = Arrays.stream(sc.nextLine().split(" "))
      .mapToInt(Integer::parseInt).toArray();
    long ans = 0;
    long a = 0;
    for (int i = 0; i <= N; i++) {
      a += i == 0 ? 0 : A[i-1];
      long b = 0;
      if (a > K) break;
      for (int j = 0; j <= M; j++) {
        b += j == 0 ? 0 : B[j-1];
        if (a+b > K) break;
        ans = Math.max(ans, i+j);
        //System.out.println("a: " + a + " b: " + b);
        //System.out.println("i: " + i + " j: " + j + " ans: " + ans);
      }
    }
    System.out.println(ans);
  }
  
}