import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int K = sc.nextInt();
      	long[] A = new long[N];
      	for (int i = 0; i < N; i++) {A[i] = sc.nextLong();}
      
      	long M_new = 1;//最大の掛け算の答え
      	long M;//暫定掛け算の答え
      	long ans;
      
      	
      	String str = "";
      	int c;//1の数を数える
      	int d = 0;//continue;以降の処理の回数を数える
      	for (int i = 0; i < (int) Math.pow(2, N); i++) {
          	//strに使うか否かの情報が入る
        	str = Integer.toBinaryString(i);
          	while (N - str.length() > 0) {
            	str = "0" + str;
            }

          	
          	c = 0;//初期化
          	for (int k = 0; k < N; k++) {
            	if (str.charAt(k) == '1') {c++;}
            }
          	if (c != K) {continue;}
          	d++;
          	
          	M = 1;//初期化
          	for (int m = 0; m < N; m++) {
            	if (str.charAt(m) == '1') {
                  	M = M * A[m];
                }
            }

          	if (d == 1) {M_new = M;}
          	if (M > M_new) {M_new = M;}
          
        }
      	ans = M_new % (( (int)Math.pow(10, 9) ) + 7);
      	if (ans < 0) {ans += (( (int)Math.pow(10, 9) ) + 7);}
      	System.out.println(ans);
    }
}