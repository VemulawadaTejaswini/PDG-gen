import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long P = sc.nextLong();
		if (N==1) {
			System.out.println(P);
			return ;
		}
		if (N>60) {
			System.out.println(1);
			return ;
		}
		long result =1;
		long now =2;
		long all=1;
		for (int i=0;i<N;i++) {
			all=all*now;
		}
		while (all<=P) {
			while (P%all==0) {
				result *=now;
				P/=all;
			}
			now++;
			all=1;
			for (int i=0;i<N;i++) {
				all=all*now;
			}
		}
		System.out.println(result);
	}
}