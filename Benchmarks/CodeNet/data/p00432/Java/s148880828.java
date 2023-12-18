import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		
		int numOfSheet = in.nextInt();
		int probNum = in.nextInt();
		int[][] matrix;
		while(!(numOfSheet==0 && probNum==0)) {
			int maxX = 0, maxY = 0;
			int[][] data = new int[numOfSheet][4];
			for(int i=0; i<numOfSheet; i++) {
				data[i][0] = in.nextInt();//x1
				data[i][1] = in.nextInt();//y1
				data[i][2] = in.nextInt();//x2
				data[i][3] = in.nextInt();//y2
				
				if(data[i][0]>maxX) maxX=data[i][0];
				if(data[i][2]>maxX) maxX=data[i][2];
				if(data[i][1]>maxY) maxY=data[i][1];
				if(data[i][3]>maxY) maxY=data[i][3];
			}
			
			matrix = new int[maxX+1][maxY+1];
			
			for(int i=0; i<data.length; i++) {
				for(int j=data[i][0]; j<data[i][2]; j++) {
					for(int k=data[i][1]; k<data[i][3]; k++) {
						matrix[k][j] = 1;
					}
				}
			}
			
			if(probNum==1 || probNum==2) {
				int area = 0;
				for(int i=0; i<matrix.length; i++) {
					for(int j=0; j<matrix[i].length; j++) {
						area+= matrix[i][j];
					}
				}
				System.out.println(area);
			}
			if(probNum==2) {
				int length = 0;
				for(int i=0; i<matrix.length; i++) {
					for(int j=0; j<matrix[i].length; j++) {
						if(matrix[i][j] == 1) length += getLength(i, j, matrix);
						
					}
				}
				System.out.println(length);
			}
			numOfSheet = in.nextInt();
			probNum = in.nextInt();
		}
	}
	
	public static int getLength(int x, int y, int[][] matrix) {
		int ret = 0;
		int n = 0;
		if(x==0&&y==0) n = matrix[x][y+1] + matrix[x+1][y];
		else if(x==0&&y==matrix[0].length-1) n = matrix[x][y-1] + matrix[x+1][y];
		else if(x==matrix.length-1&&y==0) n = matrix[x-1][y] + matrix[x][y+1];
		else if(x==matrix.length-1&&y==matrix[x].length-1) n = matrix[x][y-1] + matrix[x-1][y];
		else if(x==0) n = matrix[x][y+1] + matrix[x][y-1] + matrix[x+1][y];
		else if(x==matrix.length-1) n = matrix[x][y+1] + matrix[x][y-1] + matrix[x-1][y];
		else if(y==0) n = matrix[x-1][y] + matrix[x+1][y] + matrix[x][y+1];
		else if(y==matrix[x].length-1) n = matrix[x-1][y] + matrix[x+1][y] + matrix[x][y-1];
		else n = matrix[x-1][y] + matrix[x+1][y] + matrix[x][y-1] + matrix[x][y+1];
		
		switch(n){
		case 1:
			ret = 3;
			break;
		case 2:
			ret = 2;
			break;
		case 3:
			ret = 1;
			break;
		default:
			break;
		}
		
		return ret;
	}
}