import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] S = sc.nextLine().split(" ");
    int[] dam = new int[N];
    int sum = 0;
    for(int i = 0; i < N; i++){
      dam[i] = Integer.parseInt(S[i]);
      sum += dam[i];
    }
    
    int[] mt = new int[N];
    int as = 0;
    for(int i = 1; i < N; i+=2){
      as += dam[i];
    }
    mt[0] = sum - as*2;
    
    for(int i = 1; i < N; i++){
      mt[i] = dam[i-1]*2 - mt[i-1];
    }
    
    for(int i = 0; i < N; i++){
      if(i == N-1){
    	System.out.println(mt[i]);
      }else{
        System.out.print(mt[i]);
        System.out.print(" ");
      }
    }
  }
}