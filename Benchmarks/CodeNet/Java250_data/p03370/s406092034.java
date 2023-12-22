import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		int a[]=new int [N];
		int b=N;
		int c=1000;
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
			X=X-a[i];
			if(a[i]<c) {
				c=a[i];
			}
		}
		b=b+X/c;
		System.out.println(b);
	}
}