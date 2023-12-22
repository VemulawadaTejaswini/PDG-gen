import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int N = Integer.parseInt(s[0]);
    int K = Integer.parseInt(s[1]);
    
    String[] t = sc.nextLine().split(" ");
    int[] cost = new int[N];
    for(int i = 0; i < N; i++){
      cost[i] = Integer.parseInt(t[i]);
    }
    
    int[] result = new int[N];
    Arrays.fill(result, Integer.MAX_VALUE);
    result[0] = 0;
    
    for(int i = 0; i < N; i++){
      for(int j = i; j <= i + K && j < N; j++){
        if(j == 0){
          continue;
        }
        
        int a = Math.abs(cost[i] - cost[j]) + result[i];
        if(result[j] > a){  
 		  result[j] = a;
        }
      }
    }
    System.out.println(result[N-1]);
  }
}