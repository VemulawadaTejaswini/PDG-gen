import java.util.Scanner;

public class Main {
	
	public static class Point{
		public int x,y;
		
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static final Point[] c_move = {
		                   new Point(-1,-2) , new Point(0,-2) , new Point(1,-2) ,
		new Point(-2,-1) ,                                                        new Point(2,-1) ,
		new Point(-2, 0) ,                                                        new Point(2, 0) ,
		new Point(-2, 1) ,                                                        new Point(2, 1) ,
		                   new Point(-1, 2) , new Point(0, 2) , new Point(1, 2)
	};
	
	public static boolean dive(int x, int y, int cur_num, Point[] s_array, int limit){
		boolean done = false;
		
		if(limit <= cur_num){
			return true;
		}
		
		for(Point move : c_move){
			int m_x = x + move.x;
			int m_y = y + move.y;
			
			if(m_x < 0 || m_x > 9 || m_y < 0 || m_y > 9){
				continue;
			}
			
			int s_x = s_array[cur_num].x;
			int s_y = s_array[cur_num].y;
			
			if((s_x - 1) <= m_x && m_x <= (s_x + 1) && (s_y - 1) <= m_y && m_y <= (s_y + 1)){
				done = dive(m_x, m_y, cur_num+1,s_array,limit);
			}
			
			if(done){
				break;
			}
		}
		
		return done;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int c_x = sc.nextInt();
			int c_y = sc.nextInt();
			
			if(c_x == 0 && c_y == 0){
				break;
			}
			
			int s_num = sc.nextInt();
			Point[] sp_array = new Point[s_num];
			for(int i = 0; i < s_num; i++){
				sp_array[i] = new Point(sc.nextInt() , sc.nextInt());
			}
			
			System.out.println(dive(c_x,c_y,0,sp_array,s_num) ? "OK" : "NA");
		}
		
	}
	
}