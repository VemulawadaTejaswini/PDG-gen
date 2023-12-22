import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    sc.nextLine();
    String tmp = sc.nextLine();
    String Spl[] = tmp.split(" ");
    Long A[] = new Long[N];
    for (int i=0;i<N;i++){
      A[i] = Long.parseLong(Spl[i]);
    }
    Arrays.sort(A,Comparator.reverseOrder());
    long ans = 0;
    for (int i=(K);i<N;i++){
      ans += A[i];
    }
    System.out.println(ans);
  }
}
