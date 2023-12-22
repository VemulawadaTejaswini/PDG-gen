import java.util.Scanner;
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
		// 出力
		//System.out.println("");
		int count=0;
		int N=sc.nextInt();
		int[] a = new int[N];
		for(int i=0;i<N;i++){
			a[i]= sc.nextInt();
		}
		
		for(int i=0;i<N;i++){
			while(a[i]%2==0){
				count++;
				a[i]/=2;
			}
		}
		
		System.out.println(count);
	}
}