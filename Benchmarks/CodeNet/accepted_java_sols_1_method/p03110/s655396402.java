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
		//s.charAt(i); for String
		// 出力
		//System.out.println("");
		//int count=0;
		
		int N=sc.nextInt();
		
		
		double[] x;
		String[] u;
		
		double sum =0;
		
		x=new double[N];
		u=new String[N];
		
		for(int i=0;i<N;i++){
			x[i]=sc.nextDouble();
			u[i]=sc.next();
			
			//System.out.println(x[i]*2);
			//System.out.println(sum);
			//System.out.println(u[i]);
			if(u[i].equals("JPY")){
				double ne=x[i];
				//System.out.println(ne);
				sum+=ne;
			}else{
				double ne=x[i] * 380000;
				sum+=ne;
			}
			//System.out.println(i+":"+sum);
		}
		System.out.println(sum);
	
		
	}
	
	
}