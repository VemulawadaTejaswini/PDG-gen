import java.util.Scanner;

public class Main {

	static int[][] field;
	static boolean[][] unk;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		boolean first=true;
		while(true){


			int h=cin.nextInt();
			if(h==0){
				break;
			}
			if(first)
				first=false;
			else{
				System.out.println();
			}
			int w=cin.nextInt();
			field=new int[h+1][w+1];
			unk=new boolean[h][w];
			boolean[][] unk2=new boolean[h][w];
			int cnt=0;
			int cnt2=0;
			for(int i = 0;i<h+1;i++){
				for(int j = 0;j<w+1;j++){
					String s =cin.next();
					if(s.equals("?")){
						unk[i][j]=true;
						cnt++;
						unk2[i][j]=true;
					}
					else{
						field[i][j]=Integer.parseInt(s);
					}
				}
			}
			for(int i = 0;i<h+1;i++){
				for(int j = 0;j<w+1;j++){
					//System.out.print(field[i][j]+" ");
				}
				//System.out.println();
			}
			cnt2=cnt;
			label:for(int aaa=0;aaa<cnt;aaa++){
				for(int i  =0;i<h;i++){
					int sum=0;
					int unkCnt=0;
					int xx=0;
					int yy=0;
					for(int j = 0;j<w;j++){
						sum+=field[i][j];
						if(unk[i][j]){
							unkCnt++;
							xx=i;
							yy=j;
						}
					}
					if(unkCnt==1){
						unk[xx][yy]=false;
						field[xx][yy]=field[i][w]-sum;
						//System.out.println(field[xx][yy]);
						cnt2--;
						continue label;
					}
				}
				for(int j  =0;j<w;j++){
					int sum=0;
					int unkCnt=0;
					int xx=0;
					int yy=0;
					for(int i = 0;i<h;i++){
						sum+=field[i][j];
						if(unk[i][j]){
							unkCnt++;
							xx=i;
							yy=j;
						}
					}
					if(unkCnt==1){
						unk[xx][yy]=false;
						field[xx][yy]=field[h][j]-sum;
						cnt2--;
						//System.out.println(field[xx][yy]);
					}
				}
			}
			if(cnt2==0){
				for(int i =0;i<h;i++){
					for(int j = 0;j<w;j++){
						if(unk2[i][j]){
							System.out.println(field[i][j]);
						}
					}
				}				
			}
			else{
				System.out.println("NO");
			}


		}
	}

}