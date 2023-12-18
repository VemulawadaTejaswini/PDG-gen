import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a;
    if(N % 2 == 0){
      a = new int[N/2];
    }else{
      a = new int[N/2 + 1];
    }
    Arrays.fill(a, 0);
    for(int i = 0; i < N; i++){
      int tmp = sc.nextInt();
      if(tmp % 2 == N % 2){
        System.out.println(0);
        System.exit(0);
      }
      if(tmp > N - 1){
        System.out.println(0);
        System.exit(0);
      }
      a[tmp/2]++;
      if(a[tmp/2] > 2){
        System.out.println(0);
        System.exit(0);
      }
    }
    if(N % 2 == 0){
      for(int i = 0; i < a.length; i++){
        if(a[i] != 2){
          System.out.println(0);
          System.exit(0);
        }
      }
    }else{
      if(a[0] != 1){
        System.out.println(0);
        System.exit(0);
      }
      for(int i = 1; i < a.length; i++){
        if(a[i] != 2){
          System.out.println(0);
          System.exit(0);
        }
      }
    }
    long ans = 1L;
    for(int i = 0; i < N/2; i++){
      ans = (ans * 2) % 1000000007L;
    }
    System.out.println(ans);
  }
}