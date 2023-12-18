import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int T=sc.nextInt();
		int A=sc.nextInt();
		double H[]=new double [N];
		for(int i=0;i<N;i++) {
			H[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			H[i]=Math.abs(A-(T-H[i]*0.006));
		}
		double min1=H[0];
		int min2=0;
		for(int i=1;i<N;i++) {
			if(min1>H[i]) {
				min1=H[i];
				min2=i;
			}
		}
		min2+=1;
		System.out.println(min2);
		sc.close();
	}
}
