import java.util.Scanner;
class Main{
    public static void main(String[] args){
		int n; //件数
		int b; //棟
		int f; //階
		int r; //番目
		int v; //人数
		int[][][] canpus=new int[5][4][11];
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<5;i++){
			for(int j=1;j<4;j++){
				for(int k=1;k<11;k++){
					canpus[i][j][k]=0;
				}
			}
		}
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			b=sc.nextInt();
			f=sc.nextInt();
			r=sc.nextInt();
			v=sc.nextInt();
			canpus[b][f][r]+=v;
		}
		for(int i=1;i<5;i++){
			for(int j=1;j<4;j++){
				for(int k=1;k<11;k++){
					System.out.print(" "+canpus[i][j][k]);
				}
				System.out.println("");
			}
			if(i!=4)System.out.println("####################");
		}
    }
}

