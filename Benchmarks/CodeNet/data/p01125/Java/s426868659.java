import java.util.Scanner;

public class Main {
	static int N;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			N = sc.nextInt();
			if(N == 0) break;
			Point[] diamond = new Point[N];
			for(int i = 0; i < N; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				diamond[i] = new Point(x,y);
			}
			Point robot = new Point(10,10);
			int M = sc.nextInt();
			for(int i = 0; i < M; i++){
				String mes = sc.next();
				int length = sc.nextInt();
				getDiamond(robot,diamond,mes,length);
			}
			boolean check = true;
			for(int i = 0; i < N; i++){
				if(diamond[i].get == false){
					System.out.println("No");
					check = false;
					break;
				}
			}
			if(check)System.out.println("yes");
		}
	}
	
	static void getDiamond(Point robot, Point[] diamond,String mes, int length){
		if(mes.equals("E")){
			go(robot,diamond,true,length);
		}
		else if(mes.equals("W")){
			go(robot,diamond,true, -1 * length);
		}else if(mes.equals("S")){
			go(robot,diamond,false,-1 * length);
		}else if(mes.equals("N")){
			go(robot,diamond,false,length);
		}else{
			System.err.println("no");
		}
	}
	
	static void go(Point robot,Point[] diamond,boolean mes,int length){
		if(mes == true){
			for(int i = 0; i <= length; i++){
				doGet(robot,diamond);
				if(robot.x == 20 || i == length) break;
				robot.x += 1; 
			}
			for(int i = length; i <= 0; i++){
				doGet(robot,diamond);
				if(robot.x == 0 || i == 0) break;
				robot.x -= 1; 
			}
		}
		
		if(mes == false){
			for(int i = 0; i <= length; i++){
				doGet(robot,diamond);
				if(robot.y == 20 || i == length) break;
				robot.y += 1; 
			}
			for(int i = length; i < 0; i++){
				doGet(robot,diamond);
				if(robot.y == 0 || i == 0) break;
				robot.y -= 1; 
			}
		}
	}
	
	static void doGet(Point robot, Point[] diamond){
		for(int i = 0; i < N; i++){
			if(diamond[i].x == robot.x && diamond[i].y == robot.y){
				diamond[i].get = true;
			}
		}
	}
}

class Point{
	int x;
	int y;
	boolean get;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
		get = false;
	}
}