import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int B[] = new int[N];
        for(int i = 0; i < N; i++) {
        	A[i] = sc.nextInt();
        	B[i] = A[i];
        }
        sc.close();
        Arrays.sort(B);
        for(int i = 0; i < N; i++) {
        	if(B[N-1] != A[i]) {
        		System.out.println(B[N-1]);
        	}else {
        		System.out.println(B[N-2]);
        	}
        }
	}
}