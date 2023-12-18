import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		List<int[][]> puzzle = new ArrayList<int[][]>();
		List<int[][]> error = new ArrayList<int[][]>();
		String line = in.readLine();
		int size = Integer.parseInt(line);
		for(int n=0; n<size; n++){
			int[][] data = new int[9][9];
			int[][] label = new int[][]{
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0},
					{0, 0, 0, 0, 0, 0, 0, 0, 0}
			};

			for(int y=0; y<9; y++){
				line = in.readLine();
				String[] dst = line.split(" ");
				for(int x=0; x<9; x++){
					data[y][x] = Integer.parseInt(dst[x]);
				}
			}

			for(int y=0; y<9; y++){
				for(int x=0; x<9; x++){
					for(int m=0; m<9; m++){
						if(data[y][x] == data[m][x] && m!=y){
							label[y][x] = 1;
						}

						if(data[y][x] == data[y][m] && m!=x){
							label[y][x] = 1;
						}
					}

					int xx = x/3;
					int yy = y/3;
					for(int i=3*xx; i<3*xx+3; i++){
						for(int j=3*yy; j<3*yy+3; j++){
							if(data[y][x] == data[j][i] && i!=x && j!=y){
								label[y][x] = 1;
							}
						}
					}
				}
			}
			puzzle.add(data);
			error.add(label);
		}

		for(int n=0; n<size; n++){
			for(int y=0; y<9; y++){
				for(int x=0; x<9; x++){
					if(error.get(n)[y][x] == 1){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
					System.out.print(puzzle.get(n)[y][x]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}