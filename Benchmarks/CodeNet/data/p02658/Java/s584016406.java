import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();		//n個の整数
		final long zyou = (long) Math.pow(10, 18);
		//double zyou= Math.pow(10,18);		//10^18

		//long[] B=new long[n];

		long result=0;

		for(int i=0;i<n;i++) {		//n個の整数を計算
			long a=sc.nextLong();

			if(i==0) {
				result=a;
			}else {
				result=result*a;
			}
		}

	
		if(result==0) {
			System.out.println(0);
		}else if(zyou<result) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
		sc.close();
	}
}