import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long sum  =0;
    Long[] HP = new Long[N];
    for(int i=0; i<N; i++)
      HP[i] = sc.nextLong();
    
    if(K >= N)
      sum = 0;
    else{
		Arrays.sort(HP, Collections.reverseOrder());
       for(int i = K; i<N; i++){
         sum += HP[i];
       }
    }
    System.out.println(sum);
    
    
  }
}
