import java.util.*;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    int p[] = new int[N];
    for(int i = 0; i<N;i++){
      p[i] = Integer.parseInt(sc.next());   
    }
    Arrays.sort(p);
    int sum = 0;
    for(int i = 0; i<K;i++){
      sum += p[i];
    }
    System.out.println(sum);
  }
}


// 1000000000000000001