import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(), C = sc.nextInt();
		int B[] = new int[M];
		int A[][] = new int[N][M];
		int AB[] = new int[N];
		for(int x=0; x<M; x++)B[x] = sc.nextInt();
		for(int y=0; y<N; y++) {
			for(int z=0; z<M; z++) {
				A[y][z] = sc.nextInt();
				AB[y] += A[y][z]*B[z];
			}			
		}
		int count = 0;
		for(int i=0; i<N; i++)if(AB[i]+C > 0)count++;
		System.out.println(count);
		sc.close();
	}

}