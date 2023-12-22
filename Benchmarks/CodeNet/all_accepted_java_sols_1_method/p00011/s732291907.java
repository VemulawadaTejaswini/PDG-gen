import java.util.Scanner;

public class Main {
	public static Scanner sc;
	
	public static void main(String[] args){
		//宣言
		sc = new Scanner(System.in);
		int w=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n+1];
		int b[]=new int[n+1];
		String s[]=new String[n+1];
		int i=0;
		for(i=1;i<=n;i++){
			String str =sc.next();
			String[] ab =str.split(",");
			a[i]= Integer.parseInt(ab[0]);
			b[i]=Integer.parseInt(ab[1]);
		}
		int bar[]=new int[w+1];
		for(i=1;i<=w;i++) {
			bar[i]=i;
		}
		//演算
		for(i=1;i<=n;i++) {
			//swap
			int p =bar[(int)a[i]];
			bar[(int)a[i]]=bar[(int)b[i]];
			bar[(int)b[i]]=p;
			
		}
		//出力
		for(i=1;i<=w;i++) {
			System.out.println(bar[i]);
		}
	}
}
