import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int N=scan.nextInt();
		long[]A=new long[N];
		long result=1;

		for(int i=0;i<A.length;i++) {
			A[i]=scan.nextLong();
			if(A[i]==0) {
				result=0;
				break;
			}
		
			if(result>1000000000000000000L/A[i]) {
				result=-1;
				break;
			}else {
				result=result*A[i];
			}
		}
		System.out.println(result);
	}
}