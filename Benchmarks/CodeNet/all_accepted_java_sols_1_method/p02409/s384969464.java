import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][][] BigHouse=new int[4][3][10];
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++){
					BigHouse[i][j][k]=0;
				}
			}
		}

		int order=sc.nextInt();
		for(int i=0;i<order;i++){
			int b=sc.nextInt()-1;
			int f=sc.nextInt()-1;
			int r=sc.nextInt()-1;
			int v=sc.nextInt();
			BigHouse[b][f][r]+=v;
			if(BigHouse[b][f][r]<0){
				BigHouse[b][f][r]=0;
			}
		}

		//出力
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++){
					System.out.print(" "+BigHouse[i][j][k]);
				}
				System.out.println();
			}
			if(i!=3){
				System.out.println("####################");
			}
		}
	}

}

