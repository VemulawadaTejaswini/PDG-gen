import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	// TODO 自動生成されたメソッド・スタブ
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	long mH=m/2;
	long nH=n/2;
	long mH1=(m+1)/2;
	long nH1=(n+1)/2;
	if(n == 1 || m == 1) {
		System.out.println(1);
		return;
	}
		System.out.println(mH*nH+mH1*nH1);
	}
}