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
      	comfort += A[0] + A[1] + A[1];//4人到着
      	for (int i=2; i<=n-3; i++) {
        	comfort += A[i];
        }
      	System.out.println(-comfort);//最後に正にする
      
    }
}