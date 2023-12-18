import java.util.Scanner;

public class Baumkuchen {
	public static void main(String[] args){
		int B1 = 0;
		int B2 = 0;
		int B3 = 0;
		int B4 = 0;
		int Bmin = 0;
		int BMIN = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int b[] = new int[n];
		for(int x = 0; x <= n-1; x++){
			b[x] = scan.nextInt();
		}
		for(int p = 1; p <= n-2; p++){
			for(int q = p+1; q <= n-1; q++){
				B1 = 0;
				B2 = 0;
				B3 = 0;
				for(int i = 0; i <= p-1; i++){
					B1 += b[i];
				}
				for(int j = p; j <= q-1; j++){
					B2 += b[j];
				}
				for(int k = q; k <= n-1; k++){
					B3 += b[k];
				}
				Bmin = Math.min(B1, B2);
				Bmin = Math.min(Bmin, B3);
				BMIN = Math.max(BMIN, Bmin);
			}
		}
		for(int p = 1; p <= n-3; p++){
			for(int q = p+1; q <= n-2; q++){
				for(int r = q+1; r <= n-1; r++){
					B1 = 0;
					B2 = 0;
					B3 = 0;
					B4 = 0;
					for(int i = 0; i <= p-1; i++){
						B1 += b[i];
					}
					for(int j = p; j <= q-1; j++){
						B2 += b[j];
					}
					for(int k = q; k <= r-1; k++){
						B3 += b[k];
					}
					for(int l = r; l <= n-1; l++){
						B4 += b[l];
					}
					Bmin = Math.min(B1+B4, B2);
					Bmin = Math.min(Bmin, B3);
					BMIN = Math.max(BMIN, Bmin);
				}
			}
		}

		System.out.println("????°????????????§??????"+BMIN+"??§???");

	}
}