import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long H = 0;
		long S = 0;
		for(int i = 0 ; i < N ; ++i){
			long A = sc.nextLong();
			if(A < H){
				S += H - A;
			}else{
				H = A;
			}
		}
		System.out.println(S);
	}
}
