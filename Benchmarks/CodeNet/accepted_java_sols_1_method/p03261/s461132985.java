import java.util.Scanner;
import java.util.regex.*;
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
		//double countx=0;

		int N=sc.nextInt();
		int size;
		boolean x=true;
		//int B=sc.nextInt();
		//int Q=sc.nextInt();
		
		String[] w=new String[N];
		w[0]=sc.next();
		
		size=w[0].length();
	
		char recent=w[0].charAt(size-1);
		for(int i=1;i<N;i++){
			
			w[i]=sc.next();
			int leng=w[i].length();
			
			for(int j=0;j<i;j++){
				if(w[j].equals(w[i])){
					x=false;
					break;
				}
			}
			
			if(recent!=w[i].charAt(0)){
				x=false;
				break;
			}else{
				recent=w[i].charAt(leng-1);
				
			}
			
		}

		if(x){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		
		
	}
}