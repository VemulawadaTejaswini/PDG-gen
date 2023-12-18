import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();		//n個の整数
		double zyou= Math.pow(10,18);		//10^18
		
		//long[] B=new long[n];
		long result=0;
		
		for(int i=0;i<n;i++) {
			long a=sc.nextLong();
			if(i==0) {
				result=a;
			}else {
				result=result*a;
			}
		}
		//System.out.println(result);
		
		if(zyou<result) {
			System.out.println(result);
		}else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}