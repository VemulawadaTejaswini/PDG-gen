import java.util.Scanner;

class Main{
	public static void main(String[] args){

		int b,f,r,v;
		int[][][] room = new int[4][3][10]; //b,f,r
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int t=0;t<10;t++){
					room[i][j][t]=0;
				}
			}
		}

		Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++){
			String[] line=sc.nextLine().split(" ");
			b=Integer.parseInt(line[0]);
			f=Integer.parseInt(line[1]);
			r=Integer.parseInt(line[2]);
			v=Integer.parseInt(line[3]);
			room[b-1][f-1][r-1]=room[b][f][r]+v;
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int t=0;t<10;t++){
					System.out.print(" "+room[i][j][t]);
				}
				System.out.println(" ");
			}
			if(!(i==3)){
				System.out.println("####################");
			}
		}
	}
}