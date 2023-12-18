import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

//    	File file = new File("test.txt");
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();
    	int C = sc.nextInt();
    	int[] B = new int[M];
    	for(int i = 0; i < M; i++){
    		B[i] = sc.nextInt();
    	}
    	int[][] A = new int[N][M];
    	for(int i = 0; i < N; i++){
    		for(int j = 0; j < M; j++){
    			A[i][j] = sc.nextInt();
    		}
    	}
    	sc.close();
    	int ans = 0;
    	for(int i = 0; i < N; i++){
    		int num = 0;
    		for(int j = 0; j < M; j++){
    			num += A[i][j] * B[j];
    		}
    		num += C;
    		if(num > 0) ans++;
    	}
    	System.out.println(ans);
    }
}