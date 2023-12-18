import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      	int K = sc.nextInt();
      	int Q = sc.nextInt();
      	int i = 0;
      	int A[] = new int[Q];
      	int Count[] = new int[N + 1];
        Arrays.fill(Count, 0);
      	for(i = 0;i < Q;i++){
          A[i] = sc.nextInt();
          Count[A[i]] += 1 ;
        }
      	for(i = 1;i <= N;i++){
          if(K - Q + Count[i] >= 1){
             System.out.println("Yes");            
          }
          else{
             System.out.println("No");
          }
        }  	
    }
}