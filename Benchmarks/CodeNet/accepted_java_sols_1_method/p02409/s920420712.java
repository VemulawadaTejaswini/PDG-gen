import java.io.*;
class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb=new StringBuilder();
		int i,j,k;
		int[][][] list=new int[4][3][10];
		for(i=0;i<4;i++){
			for(j=0;j<3;j++){
				for(k=0;k<10;k++){
					list[i][j][k]=0;
				}
			}
		}
		String str=br.readLine();
		int n=Integer.parseInt(str);
		for(i=0;i<n;i++){
			String[] house=br.readLine().split(" ");
			int b=Integer.parseInt(house[0]);
			int f=Integer.parseInt(house[1]);
			int r=Integer.parseInt(house[2]);
			int v=Integer.parseInt(house[3]);
			
			b--;
			f--;
			r--;
			list[b][f][r]+=v;
		}
		for(i=0;i<4;i++){
			for(j=0;j<3;j++){
				for(k=0;k<10;k++){
					System.out.print(" "+ list[i][j][k]);
				}
				System.out.println();
			}
			if(i==3)break;
			System.out.println("####################");
		}
	}
}