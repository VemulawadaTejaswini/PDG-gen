import java.util.*;
public class Main {
	int [] vx = {1,0,-1,0};
	int [] vy = {0,-1,0,1};
	boolean [] isgoal;
	
	class C{
		int x,y,dir;
		public C(int x, int y, int dir) {
			this.x = x;this.y = y;
			if(dir == 'E')
				dir = 0;
			else if(dir == 'N')
				dir = 1;
			else if(dir == 'S')
				dir = 3;
			else
				dir = 2;
			this.dir = dir;
		}
		public String toString() {
			return "C [x=" + x + ", y=" + y + ", dir=" + dir + "]";
		}
		
	}

	private void doit(){
		Scanner sc=new Scanner(System.in);
		while(true){
			int w = sc.nextInt(), h = sc.nextInt();
			if((w|h) == 0) break;
			char [][] map = new char[h][w];
			ArrayList<C> humlist = new ArrayList<C>();
			for(int i=0; i < h;i++){
				String line = sc.next();
				for(int j=0; j < w;j++){
					char c = line.charAt(j);
					if(c == 'E' || c == 'N' || c == 'W' || c == 'S'){
						humlist.add(new C(j,i,(int)c));
						map[i][j] = '.';
					}
					else{
						map[i][j] = c;
					}
				}
			}
			int step = 0;
			LinkedList<Integer> open = new LinkedList<Integer>();
			open.add(step);
			int len = humlist.size();
			isgoal = new boolean[len];
			boolean isachieve = true;
			while(! open.isEmpty()){
				step = open.removeFirst();
				//debug
				//System.out.println(humlist.toString());
				//change dir
				for(int i = 0; i < len;i++){
					if(isgoal[i])continue;
					C nowhum = humlist.get(i);
					int nowdir = -1;
					for(int j = 0; j < 4; j++){
						nowdir = (j + 4 + nowhum.dir - 1) % 4;
						int xx = nowhum.x + vx[nowdir];
						int yy = nowhum.y + vy[nowdir];
						if((map[yy][xx] == 'X' || map[yy][xx] == '.') && ! isin(xx,yy,humlist)){
							break;
						}
					}
					nowhum.dir = nowdir;
					humlist.set(i, nowhum);
				}
				
				//move
				ArrayList<C> humlistrecord = valueC(humlist);
				for(int i=0; i < len; i++){
					if(isgoal[i]) continue;
					C nowhum = humlist.get(i);
					int xx = nowhum.x + vx[nowhum.dir];
					int yy = nowhum.y + vy[nowhum.dir];
					int movehum = getmove(xx,yy,humlistrecord);
					//System.out.println("movenum = " + movehum + " i= " + i);
					if(movehum == i){
						nowhum.x = xx;
						nowhum.y = yy;
						humlist.set(i, nowhum);
					}
					//System.out.print(humlist.toString() + " : "+ humlistrecord.toString());
					//System.out.println();
				}
				
				//escape
				for(int i = 0; i < len;i++){
					C nowhum = humlist.get(i);
					int humx = nowhum.x,humy = nowhum.y;
					if(map[humy][humx] == 'X'){
						isgoal[i] = true;
					}
				}
				
				//fin
				if(isAllGoal()){
					break;
				}
				if(step + 1 >= 180){
					isachieve = false;
					break;
				}
				open.add(step + 1);
			}
			if(isachieve){
				System.out.println(step + 1);
			}
			else{
				System.out.println("NA");
			}
			
//			//debug
//			for(int i=0; i < h; i++){
//				for(int j = 0; j < w; j++){
//					System.out.print(map[i][j]);
//				}
//				System.out.println();
//			}
//			System.out.println();
//			System.out.println("list= " + humlist.toString());
		}
	}
	
	private boolean isAllGoal(){
		for(int i=0; i < isgoal.length;i++){
			if(! isgoal[i]) return false;
		}
		return true;
	}
	
	private int getmove(int x, int y, ArrayList<C> list){
		for(int i=0; i < 4;i++){
			int xx = x + vx[i];
			int yy = y + vy[i];
			for(int j=0; j < list.size(); j++){
				if(isgoal[j])continue;
				C now = list.get(j);
				if(xx == now.x && yy == now.y){
					return j;
				}
			}
		}
		return -1;
	}
	private ArrayList<C> valueC(ArrayList<C> list){
		ArrayList<C> res =  new ArrayList<C>();
		for(int i = 0; i < list.size(); i++){
			C now = list.get(i);
			res.add(new C(now.x, now.y, now.dir));
		}
		return res;
	}
	
	private boolean isin(int x, int y,ArrayList<C> list){
		for(int i=0; i < list.size();i++){
			if(isgoal[i])continue;
			C now = list.get(i);
			if(now.x == x && now.y == y){
				return true;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}