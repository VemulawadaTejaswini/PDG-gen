import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int p[]=new int[N+1];
		for(int i=1;i<=N;i++) {
			p[i]=sc.nextInt();
		}
		int c=0;
		for(int i=1;i<=N;i++) {
			if(i==p[i]) {
				c++;
				i++;
			}
		}
		
		System.out.println(c);
	}
}
