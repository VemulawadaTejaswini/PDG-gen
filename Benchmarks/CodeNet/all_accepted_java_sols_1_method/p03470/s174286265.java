import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		int t;
		int j=1;
		for(int i=0;i<N;i++) {
			for(int k=0;k<N;k++) {
				if(a[i]>a[k]) {
					t=a[i];
					a[i]=a[k];
					a[k]=t;
				}
			}
		}
		int max=a[0];
		for(int i=0;i<N;i++) {
			if(max>a[i]) {
				j++;
				max=a[i];
			}
		}
		System.out.println(j);
	}
}
