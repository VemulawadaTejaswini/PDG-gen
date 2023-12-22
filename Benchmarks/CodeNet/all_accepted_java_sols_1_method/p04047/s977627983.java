import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		int[] L=new int[2*N];

		for(int i =0;i<2*N;i++){
			L[i]=scan.nextInt();
		}
		Arrays.sort(L);
		int ans=0;
		for(int i=0;i<N;i++){
			ans+=L[2*i];
		}
		System.out.println(ans);
	}

}
