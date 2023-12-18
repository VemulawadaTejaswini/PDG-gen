import java.util.Scanner;
import java.util.Stack;

public class Main {

	
	//　日数、雲の場所、左上の降ってない日数、右上、左下、右下
	static int n;
	static int[][][][][][] dp;
	static int[][] field;
	static int[] v1={-8,-4,-1,-2,1,2,4,8,0};
	static int[] v2={0,1,4,5};
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		for(;;){
			n=cin.nextInt();
			if(n==0)break;
			field = new int[n][17];
			for(int i=0;i<n;i++){
				for(int j=1;j<17;j++){
					field[i][j]=cin.nextInt();
				}
			}
			dp=new int[n][12][7][7][7][7];
			for(int i=0;i<n;i++){
				for(int j=0;j<12;j++){
					for(int k=0;k<7;k++){
						for(int l=0;l<7;l++){
							for(int m=0;m<7;m++){
								for(int nn=0;nn<7;nn++){
									dp[i][j][k][l][m][nn]=1<<30;
								}
							}
						}
					}
				}
				
			}
//			output();
			if(isOkay(0,6)){
				System.out.println(dp(0,6,0,0,0,0));
			}
			else{
				System.out.println("0");
			}
			
			
		}
	}
	// lt:lefttop rb rightbottom
	static int dp(int m,int position,int lt,int rt,int lb,int rb){
		if(lt>6||rt>6||lb>6||rb>6){
			return 0;
		}
		if(m==n){
			return 1;
		}


		if(!isOkay(m,position)){
//			System.out.println("  notOkay "+(m+1)+" "+position);
			return 0;
		}
		if(dp[m][position][lt][rt][lb][rb]!=1<<30)return dp[m][position][lt][rt][lb][rb];

		int re=0;
		for(int i=0;i<v1.length;i++){
			int pp=move(position,v1[i]);
			if(pp<=0||pp>=12){
//				System.out.println("  gai "+pp);
				continue;
			}
			int[] a = rain(pp,lt,rt,lb,rb);
			int llt=a[0];
			int rrt=a[1];
			int llb=a[2];
			int rrb=a[3];
			re=Math.max(re,
					dp(m+1,pp,llt,rrt,llb,rrb)
					);
		}
		return dp[m][position][lt][rt][lb][rb]=re;
	}
	static int move(int position,int a){
		int re = position+a;
		if(position==1){
			if(a < 0)return -1;
		}
		else if(position==2){
			if(a==2)return -1;
			if(a<-1)return -1;
		}
		else if(position==3){
			if(a==1||a==2)return -1;
		}
		else if(position==5){
			if(a==-2)return -1;
		}
		else if(position==6){
			
		}
		else if(position==7){
			if(a==2)return -1;
		}
		else if(position==9){
			if(a==-2)return -1;
		}
		else if(position==10){
			
		}
		else if(position==11){
			
		}
		return re;
	}
	static boolean isOkay(int m,int position){
		/*
		for(int j=1;j<17;j++){
			if((j-1)%4==0)System.out.println();
			System.out.print(field[m][j]+" ");
		}
		System.out.println();
		*/
		for(int i=0;i<4;i++){
			int pp=position+v2[i];
			if(field[m][pp]==1)return false;
		}
		return true;
	}
	static int[] rain(int position,int lt,int rt,int lb,int rb){
		lt++;
		rt++;
		lb++;
		rb++;
		if(position==1){
			lt=0;
		}
		else if(position==3){
			rt=0;
		}
		else if(position==9){
			lb=0;
		}
		else if(position==11){
			rb=0;
		}
		return new int[]{lt,rt,lb,rb}; 
	}
	static void output(){
		for(int i=0;i<n;i++){
			for(int j=1;j<17;j++){
				if((j-1)%4==0)System.out.println();
				System.out.print(field[i][j]+" ");
			}
			System.out.println();
		}
	}
}