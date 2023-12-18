
import java.util.Scanner;

public class Main {
	static int cnt=0,pos=0;
	static int[] pre=new int[100];
	static int[] ino=new int[100];
	static int[] post=new int[100];
	public static void rec(int x,int y) {
		if (x>=y) return;
		int root=pre[cnt++],cur;
		for (cur=x;cur<y;cur++) if (ino[cur]==root) break;
		rec(x,cur);
		rec(cur+1,y);
		post[pos++]=root;
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		for (int i=0;i<n;i++) pre[i]=in.nextInt();
		for (int i=0;i<n;i++) ino[i]=in.nextInt();
		rec(0,n);
		for (int i=0;i<n;i++) {
			System.out.print(post[i]);
			if (i!=n-1) System.out.print(" ");
			else System.out.print("\n");
		}
		in.close();
	}
}
