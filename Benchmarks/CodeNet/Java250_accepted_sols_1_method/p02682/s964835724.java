import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan =new Scanner(System.in);
		int A =scan.nextInt();
		int B =scan.nextInt();
		int C =scan.nextInt();
		int K=scan.nextInt();
		int result=0;
		if(K<=A+B+C) {
			if(A>K)
				result=K;
			else 
			result=A*1;
			if(K-A>0) {
				result+=0*(K-A);
				if(K-A-B>0) {
					result+=-1*(K-A-B);
				}
			}
		}
		System.out.println(result);
		
	}
}
