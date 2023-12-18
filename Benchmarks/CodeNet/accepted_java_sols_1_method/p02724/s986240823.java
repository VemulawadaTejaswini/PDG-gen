import java.util.*;
public class Main { 
	final static int maxn=(int)2e5+10;
	static int vis[]=new int [maxn];
	static int a[]=new int [maxn];
	static int b[]=new int [maxn];
	static int f[][]=new int [maxn][3];
 public static void main(String args[])
 {
	 Scanner input=new Scanner(System.in);
   int  x=input.nextInt();
   int num=x/500;
  // System.out.println(num);
   x%=500;x/=5;
   long sum=(long)num*1000+(long)x*5;
   System.out.println(sum);
}
}