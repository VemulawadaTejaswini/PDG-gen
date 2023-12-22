import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		// 出力
		//System.out.println((a+b+c) + " " + s);
	

	    int tmp=0;
	        if(a<=b&&b<c)
	             tmp=a+b;
	        if(c<=b&&b<a)
	            tmp=c+b;
	        if(b<=a&&a<c) 
	            tmp=a+b;
	        if(c<=a&&a<b)
	            tmp=c+a;
	        if(a<=c&&c<b)
	            tmp=a+c;
	        if(b<=c&&c<a)
	            tmp=c+b;
	        if(a==b&&b==c)
	        tmp=a+b;
	        System.out.println(tmp);
	       
	    
	    
	}
}
