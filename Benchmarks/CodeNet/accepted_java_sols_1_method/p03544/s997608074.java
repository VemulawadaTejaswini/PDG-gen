import java.util.Scanner;

public class Main{
	static int M = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long ans=0,pre1=2,pre2=1;
		for(int i=2;i<=num;i++) {
			long xy=pre1+pre2;
			pre1= pre2;
			pre2=xy;
			ans=xy;
		}
		System.out.println(num==0?(2):(num==1)?1:ans);
	}
}