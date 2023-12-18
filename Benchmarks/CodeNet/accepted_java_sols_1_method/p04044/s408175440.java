import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    String[] a = new String[N];
    for(int i = 0; i < N; i++){
      a[i] = sc.next();
    }
    Arrays.sort(a);
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < N; i++){
      sb.append(a[i]);
    }
    System.out.println(sb.toString());
  }
}