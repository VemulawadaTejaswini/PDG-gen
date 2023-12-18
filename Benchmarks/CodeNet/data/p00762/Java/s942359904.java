import java.util.Scanner;


public class Main {
	
	enum Direction {N,E,W,S}
	
	class Dice {
		
		int t,l,r;
		
		public Dice(int t, int l) {
			init(t,l);
		}
		
		void init(int t, int l) {
			this.t = t;
			this.l = l;
			this.r = 
					((t == 2 && l == 3) || (t == 3 && l == 5) || (t == 5 && l == 4) || (t == 4 && l == 2)) ? 1 :
					((t == 4 && l == 6) || (t == 6 && l == 3) || (t == 3 && l == 1) || (t == 1 && l == 4)) ? 2 :
					((t == 1 && l == 2) || (t == 2 && l == 6) || (t == 6 && l == 5) || (t == 5 && l == 1)) ? 3 :
					((t == 5 && l == 6) || (t == 6 && l == 2) || (t == 2 && l == 1) || (t == 1 && l == 5)) ? 4 :
					((t == 1 && l == 3) || (t == 3 && l == 6) || (t == 6 && l == 4) || (t == 4 && l == 1)) ? 5 :
					6;
		}
		
		int n() {return 7-l;}
		int e() {return r;}
		int s() {return l;}
		int w() {return 7-r;}
		int t() {return t;}
		int b() {return 7-t;}
		
		void roll(Direction d) {
			switch(d) {
			case N:
				init(l,b());
				break;
			case S:
				init(n(),t);
				break;
			case W:
				init(e(),l);
				break;
			case E:
				init(w(),l);
				break;
			}
		}
	}
	
	class Column {
		int h = 0;
		Dice d;
		public Column() {}
		void put(Dice d) {
			this.d = d;
			h++;
		}
		int getTop() {
			if(d == null) return 0;
			return d.t;
		}
	}
	
	class Map {
		int len = 200;
		Column[][] map = new Column[len][len];
		
		Column getc(int x, int y) {
			if(map[y][x] == null) map[y][x] = new Column();
			return map[y][x];
		}
		
		void drop(int x, int y, Dice d) {
			int curh = getc(x,y).h;
			int nh = getc(x,y-1).h;
			int sh = getc(x,y+1).h;
			int eh = getc(x+1,y).h;
			int wh = getc(x-1,y).h;
			
			for(int i=6; i>3; i--) {
				if(d.n() == i && nh < curh) {
					d.roll(Direction.N);
					drop(x,y-1,d);
					return;
				}
				else if(d.s() == i && sh < curh) {
					d.roll(Direction.S);
					drop(x,y+1,d);
					return;
				}
				else if(d.e() == i && eh < curh) {
					d.roll(Direction.E);
					drop(x+1,y,d);
					return;
				}
				else if(d.w() == i && wh < curh) {
					d.roll(Direction.W);
					drop(x-1,y,d);
					return;
				}
			}
			getc(x,y).put(d);
		}
		
		void drop(Dice d) {
			drop(len/2,len/2,d);
		}
		
		void print() {
			int[] nums = new int[6];
			for(int i=0; i<len; i++) {
				for(int j=0; j<len; j++) {
					if(map[i][j] != null && map[i][j].d != null) {
						nums[map[i][j].getTop()-1]++;
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			for(int i:nums){sb.append(i).append(" ");}
			System.out.println(sb.toString().trim());
		}
		
	}
	
	public Main() {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			if(n == 0) break;
			Map map = new Map();
			for(int i=0; i<n; i++) {
				map.drop(new Dice(scanner.nextInt(), scanner.nextInt()));
			}
			map.print();
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}