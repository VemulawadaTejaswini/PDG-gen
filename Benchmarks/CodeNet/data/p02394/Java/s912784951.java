import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		Cube cb = new Cube(sc.nextInt(),sc.nextInt());
		Square sqr = new Square(sc.nextInt(),sc.nextInt(),sc.nextInt());
		if(cb.checkSquare(sqr)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
class Cube{
	int w;
	int h;
	public Cube(int w,int h){
		this.w = w;
		this.h = h;
	}
	public boolean checkSquare(Square ck_sqr){
		if(ck_sqr.Radius_Plus_x() <= this.w && ck_sqr.Radius_Plus_y() <= this.h){
			return true;
		}
		return false;
	}
}


class Square{
	int x;
	int y;
	int r;

	public Square(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public int Radius_Plus_x(){
		return x+r;
	}
	public int Radius_Plus_y(){
		return y+r;
	}	
}