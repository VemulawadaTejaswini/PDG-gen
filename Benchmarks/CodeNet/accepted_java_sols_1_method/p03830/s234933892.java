import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int p = 1000000007;
    
    List<Integer> list = new ArrayList<>();
    for(int i = 2; i <= N; i++){
      boolean c = true;
      for(int j = 2; j < i; j++){
        if(i % j == 0){
          c = false;
          break;
        }
      }
      if(c){
        list.add(i);
      }
    }
    
    int ls = list.size();
    int[] sum = new int[ls];
    for(int i = 2; i <= N; i++){
      for(int j = 0; j < ls; j++){
        int n = list.get(j);
        if(n > i){
          break;
        }
        int M = i;
        while(M % n == 0){
          M /= n;
          sum[j]++;
        }
      }
    }

    long ans = 1;
    for(int i = 0; i < ls; i++){
      ans *= sum[i]+1;
      ans %= p;
    }
    System.out.println(ans);
  }
}