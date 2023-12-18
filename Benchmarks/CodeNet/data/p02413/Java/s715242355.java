import java.io.*;
public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] i=str.split(" ");
		int r=Integer.parseInt(i[0]),c=Integer.parseInt(i[1]);
		int [][]hyo=new int[r+2][c+2];
		for (int x=1;x<=r;x++){
			 str = br.readLine();
			 i=str.split(" ");
			 for(int y=0;y<c;y++){
			hyo[x][y+1]=Integer.parseInt(i[y]);
			hyo[x][c+1]+=Integer.parseInt(i[y]);
			hyo[r+1][y+1]+=Integer.parseInt(i[y]);}
			hyo[r+1][c+1]+=hyo[x][c+1];
		}
		for (int x=1;x<=r+1;x++){
			for(int y=1;y<=c+1;y++){System.out.print(hyo[x][y]);
			if(y!=c+1){System.out.print(" ");}}
			System.out.println();
		}
		}}