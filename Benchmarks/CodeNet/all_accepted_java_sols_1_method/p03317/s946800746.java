import java.util.Scanner;
import java.math.*;
import java.math.*;
public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		//s.charAt(i); for String
		// 出力
		//System.out.println("");
		//int count=0;
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}
		int count=0;
		if(N==K){
			System.out.println("1");
		}else{
			N=N-K;
			count++;
			while(N>0){
				N=N-(K-1);
				count++;
			}
		System.out.println(count);
		}
		
		// 7549236815
	}
}