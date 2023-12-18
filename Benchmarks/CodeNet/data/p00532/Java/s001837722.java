import java.util.Scanner;
public class JOI2014n2015yo2 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int[] A = new int[M];
		int num =0;
		int targetpoint = 0;
		int[] point = new int[N];
		for(int i = 0;i < N;i++){
			point[i] = 0;
		}
		for(int i = 0;i < M;i++){
			A[i] = s.nextInt();
		}
		for(int i = 0;i < M;i++){
			targetpoint = 0;
			for(int j = 0;j < N;j++){
				num = s.nextInt();
				if(A[i] == num){
					point[j] ++; 
				}else{
					targetpoint++;
				}
			}
			int h = A[i]-1;
			point[h] += targetpoint;
		}
		for(int j = 0;j < N;j++){
			System.out.printf("%d",point[j]);
			if(j < N-1){
				System.out.printf("\n");
			}
		}
	}

}