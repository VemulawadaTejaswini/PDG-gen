import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int k=sc.nextInt();
		long ans=0;
		if(a<=k){
			ans=a;
			k-=a;
		}else{
			ans=k;
			k=0;
		}
		if(b<=k){
			k-=b;
		}else{
			k=0;
		}
		if(c<=k){
			ans-=c;
		}else{
			ans-=k;
		}
		System.out.println(ans);
	}
}
