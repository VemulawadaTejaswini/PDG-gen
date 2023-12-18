import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] h = new int[N];
		int[] m = new int[N];
		for(int i = 0 ; i<N ; i++){
			h[i] = scan.nextInt();
			m[i] = scan.nextInt();
		}
		int M = scan.nextInt();
		int[] k = new int[M];
		int[] g = new int[M];
		int[] Z = new int[N+M];
		for(int i = 0 ; i<N ; i++){
			Z[i] =  h[i]*60+m[i];
		}
		for(int i = 0; i<M ; i++){
			k[i] = scan.nextInt();
			g[i] = scan.nextInt();
			Z[N+i] = k[i]*60+g[i];
		}
		int r;
		for(int i = 0; i < N+M ; i++){
			for(int j = i+1; j <M+N; j++){
				if(Z[i] > Z[j]){
					r = Z[i];
					Z[i] = Z[j];
					Z[j] = r;
				}
			}
		}
		for(int i = 0; i<N+M; i++){
			if(i == N+M-1){
				String s = String.valueOf(Z[i]%60);
				if(s.length() ==1){
					System.out.println(Z[i]/60+":0"+Z[i]%60);
				}else{
					System.out.println(Z[i]/60+":"+Z[i]%60);
				}
			}else{
				if(Z[i+1] != Z[i]){
					String s = String.valueOf(Z[i]%60);
					if(s.length() ==1){
						System.out.print(Z[i]/60+":0"+Z[i]%60+" ");
					}else{
						System.out.print(Z[i]/60+":"+Z[i]%60+" ");
					}
				}
			}
		}
	}
}