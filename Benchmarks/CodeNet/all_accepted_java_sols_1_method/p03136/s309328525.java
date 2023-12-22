import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int sum=0;
		// 整数の入力
		int N = sc.nextInt();
      	int[] L=new int[N];
		for(int i=0;i<N;i++){
		L[i] = sc.nextInt();
        }
      	Arrays.sort(L);
      	for(int i=0;i<N-1;i++){
          sum=sum+L[i];
        }
      if(L[N-1]<sum){
		System.out.println("Yes");
      }else{
        System.out.println("No");
      }
	}
}