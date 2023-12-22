import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int N;
		if(B>=10) {
			N=A*100+B;
			if(B==100) {
				N=A*1000+B;
			}
		}else N=A*10+B;
		for(int i=4;i<1000;i++) {
			if(N==Math.pow(i, 2)) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}

}
