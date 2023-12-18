import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true){
			int d=sc.nextInt(); // 高さ
			int w=sc.nextInt(); // 幅
			if(d==0&&w==0) break;
			int cells[][] = new int[d][w];
			for(int j=0;j<d;++j) {
				for(int i=0;i<w;++i) {
					cells[j][i]=sc.nextInt();
				}
			}
			
			// calculate
			int ans=0; // 結果
			for(int pd=3;pd<=d;++pd) {  // 高さのサーチサイズ（3~d）
				for(int pw=3;pw<=w;++pw) { // 幅のサーチサイズ（3~w）
					
					for(int j=0;j<=d-pd;++j) { // サーチ軸（縦方向）
						for(int i=0;i<=w-pw;++i) { // サーチ軸（横方向）
							int Maxhar; // 池の境界の最小値
							Maxhar=search(cells,i,j,pw+i,pd+j); // 池の境界の最小値を計算
							int ans_if=0; // この条件下での池の容量
							ans_if=calculate(cells,i,j,pw+i,pd+j,Maxhar); // この条件下での池の容量を計算
							if(ans<ans_if) ans=ans_if; // 池の容量を更新
						}
					}
				}
			}
			System.out.println(ans); // 計算結果の出力
		}
	}
	
	// 池の境界の最小値を計算
	public static int search(int[][] cells, int sw, int sd, int pw, int pd) {
		int min=cells[sd][sw]; // 池の境界の最小値
		for(int i=sw;i<pw;++i) {
			if(min>cells[sd][i]) min=cells[sd][i];
		}
		for(int i=sd;i<pd;++i) {
			if(min>cells[i][pw-1]) min=cells[i][pw-1];
		}
		for(int i=sw;i<pw;++i) {
			if(min>cells[pd-1][i]) min=cells[pd-1][i];
		}
		for(int i=sd;i<pd;++i) {
			if(min>cells[i][sw]) min=cells[i][sw];
		}
		return min;
	}
	
	// この条件下での池の容量を計算
	public static int calculate(int[][] cells, int sw, int sd, int pw, int pd, int min) {
		int sum=0; // 池の容量
		for(int j=sd+1;j<pd-1;++j) {
			for(int i=sw+1;i<pw-1;++i) {
				if(min<=cells[j][i]) return 0; // もしも池になっていなければ、計算を終了、0を返す
				else sum+=min-cells[j][i]; // 池の容量の計算（境界との誤差）
			}
		}
		return sum;
	}
}

