import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		int n=sc.nextInt();
		int a,b,tmp;
		int[] num=new int[w];
		for(int i=0;i<w;i++){
			num[i]=i+1;
		}
		for(int i=0;i<n;i++){
			String str=sc.next();
			String[] s=str.split(",");
			a=Integer.parseInt(s[0]);
			b=Integer.parseInt(s[1]);
			tmp=num[a-1];
			num[a-1]=num[b-1];
			num[b-1]=tmp;
		}
		for(int i=0;i<w;i++){
			System.out.println(num[i]);
		}
	}
}	
