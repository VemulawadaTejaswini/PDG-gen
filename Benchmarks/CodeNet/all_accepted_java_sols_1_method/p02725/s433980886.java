import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int T=0;
		int f=0;
		int s2=0;
		int past=0;
		for(int i=0;i!=N;i++) {
			int s = sc.nextInt();
			if(i==0) {//f=0s2=0 T=0 past=0s2=5
				f=s;
				s2=s-past;
				past=s;
			}else {
				s2=s-past;
				past=s;
			}
			
			
			
			if(T<s2) {
				T=s2;
			}
			if(i==N-1) {			
				s2=K-s+f;
				}
			if(T<s2) {
				T=s2;
			}
			
		}
		System.out.println(K-T);
	}

}
