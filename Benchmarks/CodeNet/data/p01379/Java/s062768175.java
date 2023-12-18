import java.util.Random;
import java.util.Scanner;

public class Main {
	char bord[][];
	int memo;
	int R,C;
	int step;
	boolean flag;
	public static void main(String[] args) {
		new Main().run();
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			R=sc.nextInt();
			C=sc.nextInt();
			bord=new char[R][C];
			for(int i=0;i<R;i++){
				bord[i]=sc.next().toCharArray();
			}
			memo=0;
			flag=false;
			step=0;
			f(0,0,1);
			if(flag){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
	void f(int y,int x,int move){
		step++;
		if(7800<step) return;
		//System.err.println(y+" "+x+" "+bord[y][x]+" "+move+" memo="+memo);
		if(bord[y][x]=='@'){
			flag=true;
			return; //終了
		}
		else if(bord[y][x]=='^'){
			if(y-1 < 0){
				f(R-1,x,0);
			}
			else f(y-1,x,0);
		}
		else if(bord[y][x]=='>'){
			if(C <= x+1){
				f(y,0,1);
			}
			else f(y,x+1,1);
		}
		else if(bord[y][x]=='v'){
			if(R <= y+1){
				f(0,x,2);
			}
			else f(y+1,x,2);
		}
		else if(bord[y][x]=='<'){
			if(x-1 < 0){
				f(y,C-1,3);
			}
			else f(y,x-1,3);
		}
		else if(bord[y][x]=='_'){
			if(memo==0){
				if(C <= x+1){
					f(y,0,1);
				}
				else f(y,x+1,1);
			}
			else{
				if(x-1 < 0){
					f(y,C-1,3);
				}
				else f(y,x-1,3);
			}
		}
		else if(bord[y][x]=='|'){
			if(memo==0){
				if(R <= y+1){
					f(0,x,2);
				}
				else f(y+1,x,2);
			}
			else{
				if(y-1 < 0){
					f(R-1,x,0);
				}
				else f(y-1,x,0);
			}
		}
		else if(bord[y][x]=='?'){
			Random rnd = new Random();
			int i=rnd.nextInt(4);
			//System.err.println("rnd="+i);
				if(i==0){
					if(y-1 < 0){
						f(R-1,x,0);
					}
					else f(y-1,x,0);
				}
				else if(i==1){
					if(C <= x+1){
						f(y,0,1);
					}
					else f(y,x+1,1);
				}
				else if(i==2){
					if(R <= y+1){
						f(0,x,2);
					}
					else f(y+1,x,2);
				}
				else if(i==3){
					if(x-1 < 0){
						f(y,C-1,3);
					}
					else f(y,x-1,3);
				}
		}
		else if(bord[y][x]=='.'){
			if(move==0){
				if(y-1 < 0){
					f(R-1,x,0);
				}
				else f(y-1,x,0);
			}
			else if(move==1){
				if(C <= x+1){
					f(y,0,1);
				}
				else f(y,x+1,1);
			}
			else if(move==2){
				if(R <= y+1){
					f(0,x,2);
				}
				else f(y+1,x,2);
			}
			else if(move==3){
				if(x-1 < 0){
					f(y,C-1,3);
				}
				else f(y,x-1,3);
			}
		}
		else if(bord[y][x]=='+'){
			if(memo==15){
				memo=0;
			}
			else{
				memo++;
			}
			if(move==0){
				if(y-1 < 0){
					f(R-1,x,0);
				}
				else f(y-1,x,0);
			}
			else if(move==1){
				if(C <= x+1){
					f(y,0,1);
				}
				else f(y,x+1,1);
			}
			else if(move==2){
				if(R <= y+1){
					f(0,x,2);
				}
				else f(y+1,x,2);
			}
			else if(move==3){
				if(x-1 < 0){
					f(y,C-1,3);
				}
				else f(y,x-1,3);
			}
		}
		else if(bord[y][x]=='-'){
			if(memo==0){
				memo=15;
			}
			else{
				memo--;
			}
			
			if(move==0){
				if(y-1 < 0){
					f(R-1,x,0);
				}
				else f(y-1,x,0);
			}
			else if(move==1){
				if(C <= x+1){
					f(y,0,1);
				}
				else f(y,x+1,1);
			}
			else if(move==2){
				if(R <= y+1){
					f(0,x,2);
				}
				else f(y+1,x,2);
			}
			else if(move==3){
				if(x-1 < 0){
					f(y,C-1,3);
				}
				else f(y,x-1,3);
			}
		}
		else{
			memo=bord[y][x]-'0';
			if(move==0){
				if(y-1 < 0){
					f(R-1,x,0);
				}
				else f(y-1,x,0);
			}
			else if(move==1){
				if(C <= x+1){
					f(y,0,1);
				}
				else f(y,x+1,1);
			}
			else if(move==2){
				if(R <= y+1){
					f(0,x,2);
				}
				else f(y+1,x,2);
			}
			else if(move==3){
				if(x-1 < 0){
					f(y,C-1,3);
				}
				else f(y,x-1,3);
			}
		}
	}
}