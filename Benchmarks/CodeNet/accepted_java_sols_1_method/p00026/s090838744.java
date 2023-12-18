import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in)
							.useDelimiter("[,\\s+]");
	public static void main(String[] args){
		int[][] p = new int[10][10];
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				p[i][j] = 0;
			}
		}
		while(scan.hasNext()){
			int x = scan.nextInt();
			int y = scan.nextInt();
			int size = scan.nextInt();
			switch(size){
				case 3 :
					if(x-2 >= 0)p[x-2][y]++;
					if(y-2 >= 0)p[x][y-2]++;
					if(x+2 <= 9)p[x+2][y]++;
					if(y+2 <= 9)p[x][y+2]++;
				case 2 :
					if(x-1 >= 0 && y-1 >= 0)p[x-1][y-1]++;
					if(x-1 >= 0 && y+1 <= 9)p[x-1][y+1]++;
					if(x+1 <= 9 && y-1 >= 0)p[x+1][y-1]++;
					if(x+1 <= 9 && y+1 <= 9)p[x+1][y+1]++;
				case 1:
					if(x-1 >= 0)p[x-1][y]++;
					if(y-1 >= 0)p[x][y-1]++;
					if(x+1 <= 9)p[x+1][y]++;
					if(y+1 <= 9)p[x][y+1]++;
					p[x][y]++;
					break;
			}
		}
		int count = 0, max = 0;
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(p[i][j] == 0)count++;
				max = Math.max(p[i][j], max);
			}
		}
		System.out.printf("%d\n", count);
		System.out.printf("%d\n", max);
	}
}