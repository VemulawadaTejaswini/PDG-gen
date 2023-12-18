import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int L[]=new int [N];
		int sum=0;
		for(int i=0;i<N;i++) {
			L[i]=sc.nextInt();
			sum+=L[i];
		}
		int max=L[0];
		for(int i=1;i<N;i++) {
			if(max<L[i]) {
				max=L[i];
			}
		}
		sum-=max;
		if(sum>max) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}