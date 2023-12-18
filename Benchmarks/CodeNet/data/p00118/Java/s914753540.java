
import java.util.*;
public class Main {
	final char MARK = '+';
	Scanner sc;
	int w ;
	int h;
	char [][] list;

	private void solve(int x, int y, int patMark){
		if(list[y][x] != patMark){
			return;
		}
		else{
			list[y][x] = MARK;
			solve(x-1, y, patMark);
			solve(x, y-1, patMark);
			solve(x+1, y, patMark);
			solve(x, y+1, patMark);
			return ;
		}
	}

	private void set(){
		for(int i=1; i < h + 1; i++){
			String str = sc.next();
			for(int j=0; j < w;j++){
				list[i][j+1] = str.charAt(j);
			}
		}
		//set a flame
		for(int i=0; i < w + 2; i++){
			list[0][i] = MARK;
			list[h+1][i] = MARK;
		}
		for(int i=0; i < h + 2; i++){
			list[i][0] = MARK;
			list[i][w+1] = MARK;
		}
	}

	public void doIt(){
		sc = new Scanner(System.in);
		list = new char[100][100];
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0){
				break;
			}
			//set
			set();
			int count = 0;
			for(int i=1; i < h + 1;i++){
				for(int j=1; j < w + 1; j++){
					if(list[i][j] != MARK){
						count++;
						solve(j, i, list[i][j]);
					}
				}
			}
			System.out.println(count);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}