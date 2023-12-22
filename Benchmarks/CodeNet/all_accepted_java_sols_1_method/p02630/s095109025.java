import java.util.*;
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Map<Integer,Integer> m = new HashMap<>();
    long sum = 0;
    for(int i = 0; i < N; i++){
      int A = sc.nextInt();
      m.put(A, m.getOrDefault(A,0)+1);
      sum += A;
    }
    StringBuilder ans = new StringBuilder();
    int Q = sc.nextInt();
    for(int i = 0; i < Q; i++){
      int B = sc.nextInt();
      int C = sc.nextInt();
      if(!m.containsKey(B)){
        ans.append(sum).append("\n");
        continue;
      }
      int num = m.get(B);
      sum -= (long) num*B;
      sum += (long) num*C;
      m.put(C,m.getOrDefault(C,0)+num);
      m.remove(B);
      ans.append(sum).append("\n");
    }
    System.out.println(ans);
  }
}