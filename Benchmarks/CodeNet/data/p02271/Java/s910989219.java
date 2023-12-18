/*
17D8101031C 杉山　祥吾 ID:keisei334 java
*/

import java.util.Scanner;
class Main {
    public static int n;
    public static int []A = new int[2000];
    public static void main(String[] av) {
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	for(int i = 0; i < n; i++) {
	    A[i] = sc.nextInt();
	}
	int q = sc.nextInt();
	for(int i = 0; i < q; i++) {
	    int m = sc.nextInt();
                if(isSolve(0, m)) {
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
	}
    }

    public static boolean isSolve(int i, int m) {
	if(m == 0) return true;
	if(i >= n) return false;
	boolean res = isSolve(i + 1, m) || isSolve(i + 1, m - A[i]);
	return res;
    }
}

/*実行結果

*/

