import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 要素数
		int K = sc.nextInt();
		//加算数
		int N = sc.nextInt();
		//配列
		int l [] = new int[K]; 
		int sum = 0;
		for(int i = 0; i < K; i++){
		    l[i] = sc.nextInt();
		}
		Arrays.sort(l);
		for(int j = (K-1); j >= K-N; j--){
		    sum += l[j];
		}
		System.out.println(sum);
	
	}
}