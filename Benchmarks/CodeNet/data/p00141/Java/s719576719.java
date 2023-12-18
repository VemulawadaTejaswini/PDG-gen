import java.io.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public int[][] move = new int[][]{
		{0, -1}, {1, 0}, {0, 1}, {-1, 0}
	};
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int size = Integer.parseInt(line);
		for(int i=0; i<size; i++){
			line = in.readLine();
			int n = Integer.parseInt(line);
			int data[][] = new int[n][n];
			int flag = 1;
			
			drawCorner(data, flag, 0, 0, n, n);
			
			
			for(int y=0; y<n; y++){
				for(int x=0; x<n; x++){
					if(data[y][x]==1){
						System.out.print("#");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			if(i!=size-1){
				System.out.println();
			}
		}
	}
	
	public void drawCorner(int[][] data, int flag, int x, int y, int xm, int ym){
		int first = 1;
		if(x==0 && y==0){
			first = 0;
		}
		
		if(x>=xm || y>=ym){
			return;
		}
		
		if(flag==1){
			for(int i=x; i<xm; i++){
				data[y][i] = 1;
			}
			
			for(int j=y; j<ym; j++){
				data[j][x] = 1;
			}
			
			drawCorner(data, -flag, x+2, y+1, xm, ym-first);
		}
		
		if(flag==-1){
			for(int i=x; i<xm; i++){
				data[ym-1][i] = 1;
			}
			
			for(int j=y; j<ym; j++){
				data[j][xm-1] = 1;
			}
			
			drawCorner(data, -flag, x, y+1, xm-2, ym-1);
		}
	}
}