import java.util.Scanner;

public class Main { 
	 // 必要があればインスタンス変数を宣言する 
	 // 一つ以上のメソッドを定義すること 
	 
		public void vote (int [][]sn,int [] ol){
			for(int i=0;i<ol.length;i++){
				for(int j=0;j<sn.length;j++){
					if(ol[i]>=sn[j][0]) {
						sn[j][1]++;
						break;
					}
				}
			}
		}
		
		public int max(int [][] sn){
			int max=sn[0][1];
			int maxn=0;
			for(int i=0;i<sn.length;i++){
				if(max>sn[i][1]){
					max=sn[i][1];
					maxn=i;
				}
			}
			return maxn;
		}
		
	 void doIt( ) { 
	 // これまでは main メソッドで処理していた内容を書く 
	 // クラス内で定義した一つ以上のメソッドを呼び出すこと 
		 Scanner sc=new Scanner(System.in);
			int i;
			int s=sc.nextInt();
			int o=sc.nextInt();
			
			int [][]sn = new int [s][2];
			int []ol = new int [o];

			for(i=0;i<s;i++){
				int m=sc.nextInt();
				sn[i][0]=m;
				sn[i][1]=0;
			}
			
			for(i=0;i<o;i++){
				int e=sc.nextInt();
				ol[i]=e;
			} 
			
			vote(sn,ol);
			i=max(sn);
			
			System.out.printf("%d\n",i+1);
	 } 
	 public static void main(String [ ] args) { 
		 new Main( ) . doIt( ); 
		 } 
	 } 