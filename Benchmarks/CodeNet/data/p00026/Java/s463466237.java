import java.util.Arrays;
import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		scan.useDelimiter(",|\\s+");
		int a[][] = new int[10][10];
		for(int i = 0;i < 10;i++)Arrays.fill(a[i],0);
		while(scan.hasNext()){
			int x = scan.nextInt();
			int y = scan.nextInt();
			int size = scan.nextInt();
			switch(size){
			case 3:
				if(x - 2 >= 0)a[x-2][y]++;
				if(y - 2 >= 0)a[x][y-2]++;
				if(x + 2 <= 9)a[x+2][y]++;
				if(y + 2 <= 9)a[x][y+2]++;
			case 2:
				if(x - 1 >= 0&&y - 1 >=0)a[x-1][y-1]++;
				if(x - 1 >= 0&&y + 1 <=9)a[x-1][y+1]++;
				if(x + 1 <= 9&&y - 1 >=0)a[x+1][y-1]++;
				if(x + 1 <= 9&&y + 1 <=9)a[x+1][y+1]++;
			case 1:
				if(x - 1 >= 0)a[x-1][y]++;
				if(y - 1 >= 0)a[x][y-1]++;
				if(x + 1 >= 0)a[x+1][y]++;
				if(y + 1 >= 0)a[x][y+1]++;
				a[x][y]++;				
			}
		}
		int n = 0,m = 0;
		for(int i = 0;i < 10;i++){
			for(int j = 0;j < 10;j++){
				if(a[i][j] == 0)n++;
				m = Math.max(a[i][j], m);
			}
		}
		System.out.println(n);
		System.out.println(m);
		System.exit(0);
	}

}