import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();//偶数
			int M = scan.nextInt();//奇数
			
			
			 // 配列の準備o(n*n)なのでｎ~3000くらいが限界
			int s =100;
			int n = s+5;
	        int c[][] = new int [n][n];//n=2000段作りきれるように、少し余裕を持って作成します。

	        //パスカルの三角形作成
	        int mod = 1000000007;// オーバーフロー対策：問題で指定されます。
	        c[0][0]=1;// 初期値として、最上部の1を与えます。
	        for(int i=0;i<s+2;i++) {//2000段作りきるようにループを回します。細かい事を考えないで済むように少し余裕を持たせて回しています。
	            for(int j=0;j<s+2;j++) {
	                long tmp =  c[i][j]%mod;// オーバーフロー対策
	                c[i+1][j]+=tmp;
	                c[i+1][j+1]+=tmp;
	            }
	        }
			
			//偶数から２つか奇数から二つしかない
			int kisuu = 0;
			int guusuu = 0;
			
			if(N==1&&M==1){//存在しない０
				System.out.println(0);
			}else {
				if(N<2) {
					System.out.println(c[M][2]);
				}else if(M<2) {
					System.out.println(c[N][2]);
				}else {
					System.out.println(c[N][2]+c[M][2]);
				}
			}
			
			
		}
		
		
	}
		

}
