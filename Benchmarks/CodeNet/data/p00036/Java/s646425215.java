import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		outline: while(sc.hasNextLine()) {
			int[][] in = new int[8][8];
			for(int i = 0; i < 8; i++) {
				String line = sc.nextLine();
				if(line.isEmpty()) continue outline;
				for(int j = 0; j < 8; j++) {
					in[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
				}
			}
			
			System.out.println(findFigure(in));
		}
		sc.close();
	}	
	
	
	static Figure findFigure(int[][] surface) {
		int width = 0;
		int height = 0;
		int u = 0;
		int l = 0;
		
		//horizontal direction: height
		h1: for(int i = 0; i < surface.length; i++) {
			for(int j = 0; j < surface[i].length; j++) {
				if(surface[i][j] == 1) {
					height = i;
					u = i;
					break h1;
				}
			}
		}
		h2: for(int i = surface.length-1; i >= 0; i--) {
			for(int j = 0; j < surface[i].length; j++) {
				if(surface[i][j] == 1) {
					height = i - height + 1;
					break h2;
				}
			}
		}
		
		//vertical direction: width
		w1: for(int j = 0; j < surface[0].length; j++) {
			for(int i = 0; i < surface.length; i++) {
				if(surface[i][j] == 1) {
					width = j;
					l = j;
					break w1;
				}
			}
		}
		w2: for(int j = surface[0].length - 1; j >= 0; j--) {
			for(int i = 0; i < surface.length; i++) {
				if(surface[i][j] == 1) {
					width = j - width + 1;
					break w2;
				}
			}
		}
		return kindOfFigure(surface[u][l] == 1, width, height);
	}
	
	static Figure kindOfFigure(boolean ul, int width, int height) {
		if(width == 2 && height == 2) return Figure.A;
		else if(width == 1 && height == 4) return Figure.B;
		else if(width == 4 && height == 1) return Figure.C;
		else if(width == 2 && height == 3 && !ul) return Figure.D;
		else if(width == 3 && height == 2 && ul) return Figure.E;
		else if(width == 2 && height == 3 && ul) return Figure.F;
		else if(width == 3 && height == 2 && !ul) return Figure.G;
		else return null;
	}
}

enum Figure{
	A, B, C, D, E, F, G;
}