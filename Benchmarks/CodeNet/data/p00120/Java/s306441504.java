import java.util.Scanner;

//マジで解法が思いつかなかったがbitDPをみて、まさかと思った
class Main{
	static long ans=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s="";
		double INF=11451419810.0d;
		double min=INF;
		while(sc.hasNext()) {
			min=INF;
			s=sc.nextLine();
			String[] sp=s.split(" ");
			double hako=Double.parseDouble(sp[0]);
			double[] en=new double[sp.length-1];
			for(int i=0; i<sp.length-1; i++) {
				en[i]=Double.parseDouble(sp[i+1]);
			}
			//pl(sp.length-1);
			double[][] rinsetu=new double[sp.length-1][sp.length-1];
			for(int i=0; i<sp.length-1; i++) {
				for(int j=0; j<sp.length-1; j++) {
					if(i==j) {
						rinsetu[i][j]=INF;
					}
					else {
						rinsetu[i][j]=2*Math.sqrt(en[i]*en[j]);
					}
				}
			}
			double[][] dp=new double[1<<(sp.length-1)][(sp.length-1)];
			for(int i=0; i<(1<<(sp.length-1)); i++) {
				for(int j=0; j<(sp.length-1); j++) {
					dp[i][j]=INF;	//DPテーブルの初期化（コスト最小化するので、初期値は十分に大きな正の値となる）
				}
			}
			for(int i=0;i<(sp.length-1);i++){
				dp[1<<i][i]=en[i];
			}
			for(int i=0; i<(1<<(sp.length-1))-1; i++) {		//すべての状態について探索する
				for(int j=0; j<(sp.length-1); j++) {
					if(dp[i][j]==INF) {
						continue;		//経路を確立していないなら経路をつくりだせないのでそのまま
					}
					else {	//経路が確立している時、経路を伸ばせるかどうかを判断する
						for(int k=0; k<(sp.length-1); k++) {
							if((i&(1<<k))!=0) {	//その頂点がすでに訪問済みの時は見ない（枝刈り）
								continue;
							}
							else if(rinsetu[j][k]==INF){	//すべての経路に対して行っている。　なので、ある頂点から別の頂点に伸びる辺が無いかもしれないので、無いときはスキップ
								continue;
							}
							else {		//上の2条件を満たした時、経路を伸ばせる
								int nexti=i+(1<<k);		//いまから向かう頂点の訪問フラグを立てる
								dp[nexti][k]=Math.min(dp[nexti][k], dp[i][j]+rinsetu[j][k]);	//経路の更新 最短なら更新、そうでなければ維持
								//pl("i = "+i+" j = "+j+" k = "+k+" nexti"+nexti+" bitDP[][]= "+dp[nexti][k]);
							}
						}
					}
				}
			}
			int all=(1<<(sp.length-1))-1;
			for(int i=0; i<(sp.length-1); i++) {
				if(dp[all][i]==INF) {
					continue;
				}
				else {
					double allcost=dp[all][i]+en[i];
					min=Math.min(min, allcost);
				}
			}
			if(min<hako+0.000001) {
				pl("OK");
				//pl(min);
			}
			else {
				pl("NA");
				//pl(min);
			}
		}
	}
	public static void pl(Object o) {
		System.out.println(o);
	}
	public static void pl() {
		System.out.println();
	}
	public static void p(Object o) {
		System.out.print(o);
	}
}
