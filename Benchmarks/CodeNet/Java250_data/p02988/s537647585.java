import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		// スペース区切りの整数の入力
        int[] p = new int[n];
        for(int i=0;i<n;i++){
          p[i]=sc.nextInt();
        }
        
        int count=0;
        for(int i=1;i<n-1;i++){
         if(p[i]==mid(p[i-1],p[i],p[i+1]))
             count++;
        }
		// 出力
		System.out.println(count);
	}
  public static int mid(int a,int b ,int c){
    if(a >= b) {
    		if(b >= c) {
    			return b;
    		}
    		else if(a <= c) {
    			return a;
    		}
    		else {
    			return c;
    		}
    	}
    	else if(a > c) {
    		return a;
    	}
    	else if(b > c) {
    		return c;
    	}
    	else {
    		return b;
    	}
  }
    
}