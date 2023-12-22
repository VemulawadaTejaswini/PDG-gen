import java.util.*;
public class Main{
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int X = sc.nextInt();
      int[] m = new int[N];
      
      // 残りのお菓子の素を算出
      for(int i=0; i<N; i++){
        m[i] = sc.nextInt();
        X = X - m[i];
      }  
      
      Arrays.sort(m);
      
      System.out.println(N + X/m[0]);
    }  
} 