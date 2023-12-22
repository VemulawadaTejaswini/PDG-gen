import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		int m[]=new int [N];
		int a=0;
		for(int i=0;i<N;i++) {
			m[i]=sc.nextInt();
		}
		int min=m[0];
		for(int i=1;i<N;i++) {
			if(min>m[i]) {
				min=m[i];
			}
		}
		for(int i=0;i<N;i++) {
			X=X-m[i];
			a++;
		}
		a+=X/min;
		System.out.println(a);
	}
}
