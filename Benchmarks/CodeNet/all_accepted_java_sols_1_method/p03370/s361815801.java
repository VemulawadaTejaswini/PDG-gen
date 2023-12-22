import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] m=new int[n];

		int mini=x;

		for(int i=0;i<n;i++) {
			m[i]=sc.nextInt();
			x-=m[i];
			if(mini>m[i])
				mini=m[i];
		}
		sc.close();


		System.out.print(m.length+x/mini);




	}

}
