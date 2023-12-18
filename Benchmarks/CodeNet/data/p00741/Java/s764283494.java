import java.util.Scanner;

public class Main {

	static int a,b;
	static int[][] field;

	public static void main(String args[]){

		Scanner s=new Scanner(System.in);

		while(true){
			a=s.nextInt();
			b=s.nextInt();
			if(a==0)System.exit(0);

			field = new int[a][b];

			for(int i=0; i<a; i++) {
				for(int j=0; j<b; j++) {
					field[i][j] = s.nextInt();
				}
			}
			int count =0;
			for(int i=0; i<a; i++) {
				for(int j=0; j<b; j++) {
					if(field[i][j]==1) {
						count++;
						check(i,j);
					}
				}
			}

			System.out.println(count);
		}
	}

	static void check ( int x, int y) {

		field[x][y] = 0;

		if(x>0) {
			if(field[x-1][y]==1) check(x-1,y);
			if(y>0)if(field[x-1][y-1]==1)check(x-1,y-1);
			if(y<b-1)if(field[x-1][y+1]==1)check(x-1,y+1);
		}

		if(x<a-1) {
			if(field[x+1][y]==1) check(x+1,y);
			if(y>0)if(field[x+1][y-1]==1)check(x+1,y-1);
			if(y<b-1)if(field[x+1][y+1]==1)check(x+1,y+1);
		}
		if(y>0) if(field[x][y-1]==1) check(x-1,y);
		if(y<b-1) if(field[x][y+1]==1) check(x-1,y);


		return;
	}

}

