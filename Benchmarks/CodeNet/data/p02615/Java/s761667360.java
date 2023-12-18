import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] A = new int[n];
      	for (int i=0; i<n; i++) {A[i] = - sc.nextInt();}//－にしておく
      
      	int comfort = 0;
      
      	//－なので昇順ににソートしてよい
      	Arrays.sort(A);
      	//順番に到着
        for (int i=0; i<(n+1)/2; i++) {
            comfort += A[i] * 2;
        }
          	comfort -= A[0];
      	System.out.println(-comfort);//最後に正にする
      
    }
}