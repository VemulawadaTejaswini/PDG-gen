import java.util.Arrays;
import java.util.Scanner;

//B
public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		int[]d=new int[N];
		for(int i=0;i<N;i++) {
			d[i]=sc.nextInt();
		}
		Arrays.sort(d);
//		for(int i=0;i<N;i++)
//		System.out.println(d[i]);System.out.println();
		int a=d[N/2-1];
		int b=d[N/2];
//		System.out.println("a,b\t"+a+" "+b);
		System.out.println(Math.abs(a-b));
	}

}
