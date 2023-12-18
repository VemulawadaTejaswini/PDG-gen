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
    for (int i = 0; i <= N; i++) {
      long a = Arrays.stream(A).limit(i).sum();
      if (a > K) break;
      for (int j = 0; j <= M; j++) {
        long b = Arrays.stream(B).limit(j).sum();
        if (a+b > K) break;
        ans = Math.max(ans, i+j);
        //System.out.println("a: " + a + " b: " + b);
        //System.out.println("i: " + i + " j: " + j + " ans: " + ans);
      }
    }
    System.out.println(ans);
  }
  
}