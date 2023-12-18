
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a= new int[4];
		for(int i=3;i>=0;i--)
		{
			int x=n%10;
			a[i]=x;
			n=n/10;
		}
		if(a[0]==a[1]&&a[1]==a[2]){
			System.out.println("Yes");
			return;
		}

		if(a[1]==a[2]&&a[2]==a[3]){
			System.out.println("Yes");
			return;
		}
		System.out.println("No");

	}

}
