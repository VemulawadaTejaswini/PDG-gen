import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
		try {
			String line;
			while(true){
				/* input */
				line = br.readLine();

				int w = Integer.parseInt(line.split(" ")[0]);
				int h = Integer.parseInt(line.split(" ")[1]);
				if(w == 0 && h == 0){
					return;
				} 
				int[][] field = new int[h][w];
				int[] pos = new int[2]; 
				for(int i=0;i<h;i++){
					String str = br.readLine();
					for(int j=0;j<w;j++){
						if(str.charAt(j)=='.'){
							field[i][j] = 1;
						} else if(str.charAt(j)=='#'){
							field[i][j] = 0;
						} else {
							field[i][j] = 2;
							pos[0] = i;
							pos[1] = j;
						}
					}
				}
				/*
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						System.out.print(field[i][j]);
					}
					System.out.println();
				}
				*/
				/* processing */
				int res = search(pos[0],pos[1],field,h,w);
				
				res = 0;
				
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
						if(field[i][j]==2){
							res++;
						}
					}
				}
				
				/* output */
				System.out.println(res);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int search(int posi, int posj, int[][] field,int h,int w){
		int sum = 1;
		field[posi][posj] = 2;
		
		//up
		if(posi>0&&field[posi-1][posj]==1){
			sum = 1 + search(posi-1,posj,field,h,w);
		}
		//right
		if(posj<w-1&&field[posi][posj+1]==1){
			sum = 1 + search(posi,posj+1,field,h,w);
		}
		
		//down
		if(posi<h-1&&field[posi+1][posj]==1){
			sum = 1 + search(posi+1,posj,field,h,w);
		}
		
		//left
		if(posj>0&&field[posi][posj-1]==1){			
			sum = 1 + search(posi,posj-1,field,h,w);
		}

		return sum;
	}
	
}