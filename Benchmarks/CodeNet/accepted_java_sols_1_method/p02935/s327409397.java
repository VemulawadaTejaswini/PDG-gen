import java.util.Arrays;
import java.util.Scanner;

//B
public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		double[]v=new double[N];
		for(int i=0;i<N;i++) {
			v[i]=sc.nextDouble();
		}
		Arrays.sort(v);

		//for(int i=0;i<N;i++)
		//System.out.println(v[i]);

		double ans=v[0];
		for(int i=1;i<N;i++) {
			ans=(ans+v[i])*0.5;
		}
		
		System.out.println(ans);
	}

}
