import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[] H = new int[N];
		int[] A = new int[M];
		int[] B = new int[M];
		for(int i=0; i<N; i++) {
			H[i] = s.nextInt();
		}
		for(int i=0; i<M; i++) {
			A[i]=s.nextInt();
			B[i]=s.nextInt();
		}
		
		boolean[] N_baketu = new boolean[N];
		for(int i=0; i<N; i++) {N_baketu[i] = false;} //バケツの初期化
		int counter = 0;
		for(int i=0; i<M; i++) {
			if(H[A[i]-1] < H[B[i]-1] && !(N_baketu[A[i]-1])) {
				N_baketu[A[i]-1] =true; counter++;}
		
			else if(H[A[i]-1] > H[B[i]-1] && !(N_baketu[B[i]-1])) {
				N_baketu[B[i]-1] =true; counter++;}
			
			else if(H[A[i]-1] == H[B[i]-1] ){
				if(!(N_baketu[A[i]-1])) {N_baketu[A[i]-1] =true; counter++; }
				if(!(N_baketu[B[i]-1])) {N_baketu[B[i]-1] =true; counter++; }
	            }
			}
			
			

		System.out.println(N-counter);








   }

}
