import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();		//n個の整数
		/*long zyou = (long) Math.pow(10, 18);
		
		long result=0;

		for(int i=0;i<n;i++) {		//n個の整数を計算
			long a=sc.nextLong();
			
			if(i==0) {
				result=a;
			}else {
				result=result*a;
			}
		}
		
		//System.out.println(zyou);
		//System.out.println(result);
		
		if(zyou<result) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}*/
		
		long result=1;
		long zyou = (long) Math.pow(10, 18);
		
		for(int i=0;i<n;i++) {
			long a=sc.nextLong();
			if(a==0) {
				result=0;
				break;
			}
			if(zyou/result>=a) {
				result*=a;
			}else {
				result=-1;
			}
		}
		System.out.println(result);
		sc.close();
	}
}