import java.util.*;

public class Main{
	//2006 start
	
	int [] vx = {0,1,0,-1};
	int [] vy = {1,0,-1,0};
	int w, h;
	
	class State {
		int x,y,pos,step;
		StringBuilder dice;
		public State(int x, int y, int pos, int step, StringBuilder dice) {
			this.x = x;
			this.y = y;
			this.pos = pos;
			this.step = step;
			this.dice = dice;
		}
		@Override
		public String toString() {
			return "State [x=" + x + ", y=" + y + ", pos=" + pos + ", step="
					+ step + ", dice=" + dice + "]";
		}
		
	}
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h) == 0) break;
			char [][] data = new char[h][w];
			int sx = -1, sy = -1;
			for(int i = 0; i < h; i++){
				String s = sc.next();
				if(s.indexOf("#") > 0){
					sx = s.indexOf("#");
					sy = i;
					s.replace('#', 'w');
				}
				data[i] = s.toCharArray();
			}
			String order = sc.next();
			
			LinkedList<State> open = new LinkedList<State>();
			String dice = "rcgmby";
			open.add(new State(sx, sy, 0, 0, new StringBuilder(dice)));
			
			HashSet<String> close = new HashSet<String>();
			close.add(dice + " " + sx + " " + sy);
			
			int ans = -1;
			while(! open.isEmpty()){
				State now = open.poll();
				if(now.pos == 6){
					ans = now.step;
					break;
				}
				
				for(int i = 0; i < 4; i++){
					int xx = now.x + vx[i];
					int yy = now.y + vy[i];
					StringBuilder nextd = new StringBuilder(now.dice.toString());
					nextd = rotate(nextd, i);
					String nextc = nextd.toString() + " " + xx + " " + yy+ " " + (now.pos);
					
					
					if(! isOK(xx,yy)) continue;
					char next = data[yy][xx];
					if(close.contains(nextc)) continue;
					if(next == 'w'){
						close.add(nextc);
						open.add(new State(xx, yy, now.pos, now.step + 1, nextd));
					}
					else if(next == order.charAt(now.pos) && order.charAt(now.pos) == nextd.charAt(0)){
						close.add(nextc);
						open.add(new State(xx, yy, now.pos + 1, now.step + 1, nextd));
					}
				}
			}
			System.out.println(ans == -1 ? "unreachable" : ans);
		}
	}

	private boolean isOK(int xx, int yy) {
		if(0 <= yy && yy < h && 0<= xx && xx < w){
			return true;
		}
		return false;
	}

	private StringBuilder rotate(StringBuilder dice, int i) {
		switch(i){
		case 0: 
			//down
			swap(dice, 0,2,1,3);
			break;
		case 1:
			//right
			swap(dice, 0,5,1,4);
			break;
		case 2:
			//up
			swap(dice, 0,3,1,2);
			break;
		case 3:
			//left
			swap(dice, 0,4,1,5);
			break;
		}
		return new StringBuilder(dice.toString());
	}

	private void swap(StringBuilder dice, int i, int j, int k, int l) {
		char c = dice.charAt(i);
		dice.setCharAt(i, dice.charAt(j));
		dice.setCharAt(j, dice.charAt(k));
		dice.setCharAt(k, dice.charAt(l));
		dice.setCharAt(l, c);
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}