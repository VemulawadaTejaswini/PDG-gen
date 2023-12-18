import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[31];
		int w,n,x,y;
		w = in.nextInt();
		for(int i=1;i<=w;i++)
			a[i] = i;
		n = in.nextInt();
		for(int i=0;i<n;i++) {
			String str = in.next();
			String num[] = str.split(",");
			x = Integer.parseInt(num[0]);
			y = Integer.parseInt(num[1]);
			int t = a[x];
			a[x] = a[y];
			a[y] = t;
		}
		for(int i=1;i<=w;i++) {
			System.out.println(a[i]);
		}
		in.close();
	}
}
