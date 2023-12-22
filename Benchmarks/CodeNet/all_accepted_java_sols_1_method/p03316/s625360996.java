import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int num = 0;
		int tmp = N;
		while(N>=10) {
			num += N%10;
			N = N/10;
		}
		num += N;
		if(tmp%num==0) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
		in.close();
		
	}
}