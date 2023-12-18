import java.util.*;
public class Main {
	char [][] list;
	int xpos;
	int ypos;

	private void setList(int x, int y, int n, int dis){
		//上
		if(dis == 0){
			for(int i=0; i < n; i++){
				list[y - i][x] = '#';
				xpos = x;
				ypos = y-i;
			}
		}
		//右
		else if(dis == 1){
			for(int i=0; i < n ;i++){
				list[y][x+i] = '#';
				xpos = x+i;
				ypos = y;
			}
		}
		//↓
		else if(dis == 2){
			for(int i=0; i < n; i++){
				list[y+i][x] = '#';
				xpos = x;
				ypos = y+i;
			}
		}
		//左
		else if(dis == 3){
			for(int i=0; i < n; i++){
				list[y][x - i] = '#';
				xpos = x-i;
				ypos = y;
			}
		}

	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			int m = sc.nextInt();
			list = new char[m][m];
			for(int i=0; i < m ;i++){
				Arrays.fill(list[i], ' ');
			}
			xpos = 0;
			ypos = m-1;
			setList(xpos, ypos, m, 0);
			int len = m;
			for(int i=1; len >= 2 ; i++){
				setList(xpos, ypos, len, i % 4);
				i++;
				if(len != 2){
					setList(xpos, ypos, len, i % 4);
				}
				len -= 2;
			}
			//print
			for(int i=0; i < m; i++){
				for(int j=0; j < m; j++){
					System.out.print(list[i][j]);
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}