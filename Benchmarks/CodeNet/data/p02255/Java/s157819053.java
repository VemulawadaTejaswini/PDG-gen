import java.util.Scanner;

public class Main {

	public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        // 配列の要素数は先に入れさせる
        int N = sc.nextInt();
        int []A = new int[N];
        //各配列の数を入れる
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
		for (int i = 1; i < N; i++) {
	        out_put(A);
			int j;
			int tmp = A[i];
			for(j = i;j > 0 && A[j - 1] > tmp; j--)
				A[j] = A[j-1];
			A[j] = tmp;
		}
        out_put(A);
    }

	private static void out_put(int array[]){

        System.out.printf("%d", array[0]);

        for(int i = 1; i < array.length; i++){
            System.out.printf(" %d", array[i]);
        }
        System.out.printf("\n");
    }
}

