import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	static Puzzle[][] p = new Puzzle[5][5];
	static Puzzle[] tmp;
	static int ans;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while(N--!=0){
			p = new Puzzle[5][5];
			tmp = new Puzzle[10];
			ans=0;
			for(int i = 0;i<5;i++){
				for(int j = 0;j<5;j++){
					p[i][j]= new Puzzle(0,0,0,0);
				}
			}
			for(int i = 1;i<=9;i++){
				String str = cin.next();
				char[] s = str.toCharArray();
				tmp[i]=new Puzzle(s[0],s[1],s[2],s[3]);
			}
			piece(0);
			System.out.println(ans);
		}
	}
	static void piece(int a){
		if(a==9){
			ans++;
			return;
		}
		int x = a/3+1;
		int y = a%3+1;
		if(a==1){
		//System.out.println(a+" "+ x+" " +y);
		}
		for(int i = 1;i<=9;i++){
			for(int j = 1;j<=4;j++){
				if(tmp[i].top==0){
					break;
				}
				if(set(x,y,tmp[i])){
					p[x][y]=tmp[i];
					Puzzle puz = tmp[i];
					tmp[i]=new Puzzle(0,0,0,0);
					piece(a+1);
					tmp[i]=puz;
					p[x][y]=new Puzzle(0,0,0,0);
				}
				tmp[i].turn();
			}
		}
	}
	static boolean set(int x,int y,Puzzle puzzle){
		if(!(Math.abs(puzzle.top-p[x-1][y].bottom) == 32 || p[x-1][y].bottom==0)){
			return false;
		}
		if(!(Math.abs(puzzle.left-p[x][y-1].right) == 32 || p[x][y-1].right==0)){
			return false;
		}
		if(!(Math.abs(puzzle.bottom-p[x+1][y].top) == 32 || p[x+1][y].top==0)){
			return false;
		}
		if(!(Math.abs(puzzle.right-p[x][y+1].left) == 32 || p[x][y+1].left==0)){
			return false;
		}
		return true;
		
	}
}
class Puzzle{
	int top;
	int bottom;
	int right;
	int left;
	Puzzle(int a,int b,int c,int d){
		top=a;bottom=c;right=b;left=d;
	}
	void turn(){
		int tmp = top;
		top = right;
		right = bottom;
		bottom = left;
		left = tmp;
		
	}
}