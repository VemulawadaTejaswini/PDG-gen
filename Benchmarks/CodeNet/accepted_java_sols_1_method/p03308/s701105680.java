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
		
		int N=sc.nextInt();
		//int B=sc.nextInt();
		int[] a=new int[N];
		int dif=-1;
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i-1<N;i++){
			for(int j=i+1;j<N;j++){
				int newdif=Math.abs(a[i]-a[j]);
				if(newdif>dif){
					dif=newdif;
				}
			}
		}
		System.out.println(dif);
			
		}
		
	
	
}