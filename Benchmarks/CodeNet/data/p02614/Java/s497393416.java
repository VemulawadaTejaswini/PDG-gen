import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		char[][] c = new char[H][W];
		for(int i=0;i<H;i++) {
			String S = sc.next();
			char[] C = S.toCharArray();
			c[i] = C;
		}
        for (int i = 0; i < 1 << H+W; i++) {
            // bit全探索の全通りのloop
        	int[] A = new int[H+W];
            for (int j = 0; j < H+W; j++) {
                 if ((1 & i >> j) == 1) {
                	 A[j]=1;
                 }
            }
            // 行
            int[] R = new int[H];
            for(int k=0;k<H;k++) {
            	R[k]=A[k];
            }
            // 列
            int[] C = new int[W];
            for(int k=H;k<H+W;k++) {
            	C[k-H]=A[k];
            }
            int cnt = 0;
            for(int k=0;k<H;k++) {
            	for(int l=0;l<W;l++) {
            		if(c[k][l]=='#') {
            			if(C[l]==0&&R[k]==0) {
                			cnt++;
            			}
            		}
            	}
            }
            if(cnt==K) {
            	ans++;
            }

        }
        System.out.println(ans);
    }
}
