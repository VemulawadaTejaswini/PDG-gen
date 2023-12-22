import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean f=true;
		for(int i=n-1;i>0;i--) {
			if(a[i-1]-a[i]>=2) {
				f=false;
			}else if(a[i-1]-a[i]==1) {
				a[i-1]--;
			}
		}
		if(f)
		    System.out.print("Yes");
		else
			System.out.print("No");

	}

}