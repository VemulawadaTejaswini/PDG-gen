import java.util.*;

public class Main {
	final int INF = 1 << 24;
	class C implements Comparable<C>  {
		int start;
		int cost;
		int list;
		int x,y;
		public C(int start, int cost, int list, int x, int y) {
			this.start = start;
			this.cost = cost;
			this.list = list;
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(C o) {
			if(cost < o.cost)  return 1;
			if(cost > o.cost) return -1;
			return 0;
		}
	}// c end
	
	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x == 0 && y == 0) break;
			char [][] data = new char[y][x];
			int sx=0,sy=0;
			for(int i = 0; i < y; i++){
				String str = sc.next();
				for(int j = 0; j < x; j++){
					if(str.charAt(j) == 'S'){
						sx = j;
						sy = i;
					}
					data[i][j] = str.charAt(j);
				}
			}
			
			PriorityQueue<C> open = new PriorityQueue<C>();
			int [] close = new int[1<<6];
			Arrays.fill(close, INF);
			close[0] = 0;
			open.add(new C(0,0,0,sx,sy));
			int ans = INF;
			int ansstart = 0;
			while(! open.isEmpty()){
				C now = open.poll();
				//System.out.println(now.list) ;
				if(now.list == 0){ 
					for(int i =0; i < y; i++){
						for(int j = 0; j < x; j++){
							char nowchar = data[i][j];
							if( !(nowchar == 'S' || nowchar == 'G' || nowchar == '.')){
								//コスト
								int xdis = Math.abs(now.x - j);
								int ydis = Math.abs(now.y - i);
								int startchar = nowchar - '0';
								open.add(new C(startchar,xdis + ydis,startchar,j,i));
								close[startchar] = xdis + ydis;
							}
						}
					}
				}
				else if(now.list == (1 << 5) - 1){
					//find a goal
					for(int i =0; i < y; i++){
						for(int j =0; j < x; j++){
							if(data[i][j] == 'G'){
								//calc a cost
								int xdis = Math.abs(now.x - j);
								int ydis = Math.abs(now.y - i);
								int nowcost = now.cost + xdis + ydis;
								if(ans  > nowcost){
									ans =nowcost;
									ansstart = now.start;
								}
//								ans = Math.min(ans, nowcost);
//								ansstart = now.start;
								
							}
						}
					}
				}
				//other
				else{
					//loop a list
					for(int i = 1; i < 6 ; i++){
						if((now.list & (1 << i)) == 0){
							for(int j = 0; j < y; j++){
								for(int k = 0; k < x; k++){
									char nowchar = data[j][k];
									if(nowchar - '0' == (i + 1)){
										//calc a cost
										int xdis = Math.abs(now.x - k);
										int ydis = Math.abs(now.y - j);
										int nowcost = now.cost + xdis + ydis;
							
										int nextlist = now.list | (1 << i);
										//System.out.println(now.list  + " " +nextlist);
										//System.out.println(nowcost +" " +close[nextlist]);
										if(close[nextlist] > nowcost){
											open.add(new C(now.start,nowcost,nextlist,k,j));
											close[nextlist] = Math.min(close[nextlist], nowcost);
											//System.out.println(close[nextlist] + " " + nextlist);
										}
										
									}
								}
							}
						}
					}
				}
			}
			if(ans == INF){
				System.out.println("NA");
			}
			else{
				System.out.println(ansstart - 1 + " " + ans);
			}
			
		}
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}