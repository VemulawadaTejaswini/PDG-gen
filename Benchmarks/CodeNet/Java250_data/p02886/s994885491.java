import java.util.Scanner;
class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

      	int X = 0;
      
		int N = sc.nextInt();
      
		int [] M;
		M = new int[N];

		for (int i = 0; i < N; i++) {
			M[i] = sc.nextInt();
		}
      
		for (int i = 0; i < N - 1; i++) {
        	for (int j = i + 1; j < N ; j++) {
        		X = X + M[i] * M[j];
        	}
        }
      	
      	System.out.print(X);
		return;
	}
}