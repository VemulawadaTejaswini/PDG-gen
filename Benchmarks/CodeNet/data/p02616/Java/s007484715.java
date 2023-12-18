import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int K = sc.nextInt();
      	long[] A = new long[N];
      	int n = 0;//負の数の個数
      	for (int i = 0; i < N; i++) {
          	A[i] = sc.nextLong();
          	if (A[i] < 0) {n++;}
        }
      	Arrays.sort(A);//昇順にソート
      
      	long M_new = 1;//最大の掛け算の答え
      	long M = 1;//暫定掛け算の答え
      	long div = (long) Math.pow(10, 9) + 7;
      	long ans;
      
      	for (int i = A.length - 1; i > A.length - K - 1; i--) {
        	M *= A[i];
        }
      	if ((N == K)&&(n == N)) {
          	M_new = M;
        } else if (M >= 0) {
        	M_new = M;
        } else {
        	M_new = M / A[A.length-1] * A[0];
        }
      	ans = M % div;
      	if (ans < 0) {ans += div;}
      	System.out.println(ans);
    }
}