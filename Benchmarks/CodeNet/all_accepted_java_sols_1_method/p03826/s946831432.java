import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int S = 0;
		if(A * B >= C * D){
			S = A * B;
		}else if(A * B < C * D){
			S = C * D;
		}
		System.out.print(S);
	}
}