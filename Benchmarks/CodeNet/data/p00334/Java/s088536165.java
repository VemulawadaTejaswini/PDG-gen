import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] I = new int[N];
		int D = 0;
		int E = 0;
		int F = 0;
		int G = 0;
		int ans = 0;

		for(int i=0;i<N;i++){
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();

			int n = a + b + c;
			I[i] = n;
		}
		for(int j=0;j<N;j++){
			int d = I[j];
			if(d==9){
				if(D!=1){
					D += 1;
				}else{
					ans += 1;
				}
			}
			if(d==8){
				if(E!=1){
					E += 1;
				}else{
					ans += 1;
				}
			}
			if(d==7){
				if(F!=1){
					F += 1;
				}else{
					ans += 1;
				}
			}
			if(d==6){
				if(G!=1){
					G += 1;
				}else{
					ans += 1;
				}
			}
		}
		System.out.println(ans);
	}
}