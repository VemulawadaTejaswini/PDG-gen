import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sx=sc.nextInt();
		int sy=sc.nextInt();
		int tx=sc.nextInt();
		int ty=sc.nextInt();
		int h=ty-sy;
		int w=tx-sx;
		int t=h+1,g=w+1;
		int[]c={w,h,1,t,g,t,w,1,g,t,1};
		String r="R",u="U",l="L",d="D";
		String[]s={r,u,r,d,l,u,r,u,l,d,r};
		for(int i=0;i<11;i++)
			for(int j=0;j<c[i];j++)
				System.out.print(s[i]);
		System.out.println();
	}
}