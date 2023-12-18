import java.util.*;

class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int sum_a = 0;
        for (int i=0; i<M; i++) {
        	int a = sc.nextInt();
        	sum_a += a;
        }
        
        if (sum_a <= N)
        	System.out.println(N-sum_a);
        else
        	System.out.println(-1);
        	

	}

}