import java.awt.geom.Point2D;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	static Scanner in = new Scanner(System.in);
	final double EPS=1.0e-8;
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new B().doIt();
	}
	
	class B{
		
		int h;
		int[][] field;
		int point;
		void doIt(){
			
			while(true){
				h = in.nextInt();
				if(h == 0)return;
				field = new int[h][5];
				for(int i=0;i<h;i++)for(int s=0;s<5;s++)field[i][s] = in.nextInt();
				point = 0;
				play();
			}
		}
		
		void play(){
			while(true){
				int plusPoint = deleteStone();
				if(plusPoint == 0)break;
				point += plusPoint;
				fixField();
//				print();
			}
			System.out.println(point);
		}
		
		void fixField(){
			for(int x=0;x<5;x++){//watch tate
				for(int y=h-1;y>=0;y--)if(field[y][x] < 0){
					for(int dy = y-1;dy >= 0; dy--)if(field[dy][x] > 0){
						int hoge = field[dy][x];
						field[dy][x] = field[y][x];
						field[y][x] = hoge;
						break;
					}
				}
			}
		}
		
		int deleteStone(){
			int p = 0;
			for(int i=0;i<h;i++)p += deleteLine(i);
			return p;
		}
		
		int deleteLine(int y){
			int count = 0;
			int targetNumber = field[y][2];
			if(targetNumber == -1)return 0;
			
			if(field[y][1] == targetNumber && field[y][3] == targetNumber
					&&field[y][0] == targetNumber && field[y][4] == targetNumber){
				count=5;
				field[y][0] = field[y][1] = field[y][2] = field[y][3] = field[y][4] = -1;
			}else if(field[y][0] == targetNumber && field[y][1] == targetNumber && field[y][3] == targetNumber
					 ){
				count=4;
				field[y][0] = field[y][1] = field[y][2] = field[y][3] = -1;
			}else if(field[y][1] == targetNumber && field[y][3] == targetNumber
					&& field[y][4] == targetNumber){
				count=4;
				field[y][1] = field[y][2] = field[y][3] = field[y][4] = -1;
			}else if(field[y][1] == targetNumber && field[y][3] == targetNumber
					){
				count=3;
				 field[y][1] = field[y][2] = field[y][3] = -1;
			}else if(field[y][1] == targetNumber &&field[y][0] == targetNumber){
				count=3;
				field[y][0] = field[y][1] = field[y][2] = -1;
			}else if(field[y][3] == targetNumber && field[y][4] == targetNumber){
				count=3;
				field[y][2] = field[y][3] = field[y][4] = -1;
			}
			
			return count * targetNumber;
		}
		
		void print(){
			System.out.println();
			for(int i=0;i<h;i++){
				for(int s=0;s<5;s++)System.out.print(field[i][s]+" ");
				System.out.println();
			}
		}
	}
	
}