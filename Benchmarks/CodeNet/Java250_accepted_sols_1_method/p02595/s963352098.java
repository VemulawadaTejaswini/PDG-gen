import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		// スペース区切りの整数の入力
		int D = sc.nextInt();
        int A[];
		A = new int[N];
        int B[];
		B = new int[N];
        for (int i = 0; i < N; i++){
			 A[i] = sc.nextInt();
			 B[i] = sc.nextInt();
        }
        double X[];
		X = new double[N];
        double Y[];
		Y = new double[N];
        for (int i = 0; i < N; i++){
			 X[i] = A[i];
			 Y[i] = B[i];
        }
        double L;
        int Nstep ;
        Nstep=0;
        for (int j = 0; j < N; j++){
        	L=Math.sqrt((X[j]*X[j])+(Y[j]*Y[j]));
      	    if (L<=D){
        		Nstep=Nstep+1;
        	}
        }
		// 出力
		System.out.println(Nstep);
	}
}
