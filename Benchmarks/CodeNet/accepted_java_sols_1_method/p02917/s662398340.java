import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int B[] = new int[N - 1];
      	int A[] = new int[N];
        int count = 0;
      	int i = 0;
      	for(i = 0;i < N - 1;i++){
          B[i] = sc.nextInt();
        }
      	A[0] = B[0];
      	for(i = 1;i < N - 1; i++){
          if(B[i - 1] < B[i]){
            A[i] = B[i - 1];
          }else if(B[i - 1] >= B[i]){
          	A[i] = B[i];
          }
        }
      	A[N - 1] = B[N - 2];
      	for(i = 0;i < N; i++){
          count += A[i] ;
        }
        System.out.println(count);   
    }
}