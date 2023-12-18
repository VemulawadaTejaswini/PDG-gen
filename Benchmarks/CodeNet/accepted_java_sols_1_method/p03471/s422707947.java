import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int Y = sc.nextInt();

		for (int i = 0; i <= N; i++){
			for (int j = 0; j+i <= N; j++){
				for (int k = N-i-j; k+i+j <= N; k++){
					if (((i*1000)+(j*5000)+(k*10000)) == Y && (i+j+k) == N){
						System.out.println(k+" "+j+" "+i);
						sc.close();
						return;
					}
				}
			}
		}

		System.out.println("-1 -1 -1");
		sc.close();
	}
}
