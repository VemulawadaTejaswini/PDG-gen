import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		int ans = 0;
		for (int i = 0; i < K; i++){
			if (A > B){
				if (A > C){
					A *= 2;
				}else{
					C *= 2;
				}
			}else{
				if (B > C){
					B *= 2;
				}else{
					C *= 2;
				}
			}

		}

		System.out.println(A + B + C);
	}
}
