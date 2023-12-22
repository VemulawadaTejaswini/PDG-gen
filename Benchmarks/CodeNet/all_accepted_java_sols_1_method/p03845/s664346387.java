import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	/* 入力 */
	int n = scan.nextInt();
	int[] t = new int[n];
	for(int i = 0; i < n; i++){
	    t[i] = scan.nextInt();
	}
	int m = scan.nextInt();
	int[] p = new int[m];
	int[] x = new int[m];
	for(int i = 0; i < m; i++){
	    p[i] = scan.nextInt();
	    x[i] = scan.nextInt();
	}

	/* 合計時間を求める */
	int sum = 0;
	for(int i = 0; i < n; i++){
	    sum += t[i];
	}

	/* 出力 */
	for(int i = 0; i < m; i++){
	    System.out.println(sum-(t[p[i]-1]-x[i]));
	}
    }
}
