import java.util.*;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] numCount = new int[200001];
    Set<Integer> setA = new HashSet<Integer>();
    int ans =0;
    for (int i =0; i<N; i++) {
      int A = sc.nextInt();
      numCount[A]++;
      setA.add(A);
    }
    int[] countList = new int[setA.size()];
    int a=0,b=0;
    while (a<= 200000 && b <setA.size()) {
      if (numCount[a] == 0) {
        a++;
        continue;
      }
      countList[b] = numCount[a];
      a++;
      b++;
    }
    Arrays.sort(countList);
    for (int i =0; i<setA.size() - K; i++) {
      ans += countList[i];
    }
    System.out.println(ans);
  }
}