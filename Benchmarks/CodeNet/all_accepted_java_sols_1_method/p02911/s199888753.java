import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
        long k=sc.nextLong();
        int q=sc.nextInt();
		// 文字列の入力
        long[] p=new long[n];
      for(int i=0;i<n;i++){
      	p[i]=k-q;
      }
        for (int i=0;i<q;i++){
        	int a=sc.nextInt();
            p[a-1]++;
        }
      
      for(int i=0;i<n;i++){
      	if(p[i]>0){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
      }
          // 出力
      
          //System.out.println(o[n]);
      }
}