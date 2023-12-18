import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			int w = sc.nextInt();
			int h = sc.nextInt();

				if(w==0&&h==0)break;
			int[][] map = new int[h][w];
			int[][] submap = new int[h][w];
			Mapnode[][] mapnode = new Mapnode[h][w];
			HashMap<Integer, LinkedList<int[]>> dp = new HashMap<Integer, LinkedList<int[]>>();

			int starty = -1;
			int startx = -1;
			int goaly = -1;
			int goalx = -1;

			int max = 0;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					mapnode[i][j] = new Mapnode(i, j);
					String str = sc.next();
					if (str.equals("S")) {
						map[i][j] = 20000;
						starty = i;
						startx = j;
						mapnode[i][j].name = "S";
					} else if (str.equals("G")) {
						mapnode[i][j].name = "G";
						map[i][j] = 20001;
						goaly = i;
						goalx = j;
					} else if (str.equals("."))
						map[i][j] = 0;
					else {
						map[i][j] = Integer.parseInt(str);
						int[] subsub = new int[2];
	
						if(!dp.containsKey(map[i][j])){
							LinkedList<int[]> ppp = new LinkedList<int[]>();						
							dp.put(map[i][j], ppp);
							
						}
						
						subsub[0] = i;
						subsub[1] = j;
						dp.get(map[i][j]).add(subsub);
						max = Math.max(map[i][j], max);

					}

				}

			}

			int[] subbb = new int[2];
			LinkedList<int[]> startstart = new LinkedList<int[]>();
			subbb[0] = starty;
			subbb[1] = startx;

			dp.put(0, startstart);
			dp.get(0).add(subbb);

			int[] subbb2 = new int[2];
			LinkedList<int[]> goalgoal = new LinkedList<int[]>();
			subbb2[0] = goaly;
			subbb2[1] = goalx;

			dp.put(max + 1, goalgoal);
			dp.get(max + 1).add(subbb2);

			Masuda[][] masu = new Masuda[max+2][1000];

			for (int i = 0; i < max+2; i++) {
				for (int j = 0; j < 1000; j++) {
					masu[i][j] = new Masuda();
				}
			}

			masu[0][0].y = dp.get(0).get(0)[0];
			masu[0][0].x = dp.get(0).get(0)[1];
			masu[0][0].time = true;


		/*	System.out.println(dp.get(1).size());
			System.out.println(dp.get(2).size());
			System.out.println(dp.get(3).size());
			System.out.println(dp.get(4).size());
			System.out.println(dp.get(5).size());
			*/
			for (int i = 1; i <= max + 1; i++) {
				for (int[] j : dp.get(i)) {					
					for (int k = 0; k < 1000; k++) {
						if (masu[i-1][k].time) {
							Masuda mmm = masu[i-1][k];
							int sumy = mmm.y < j[0] ? j[0] - mmm.y : mmm.y - j[0];
							int sumx = mmm.x < j[1] ? j[1] - mmm.x : mmm.x - j[1];
							int sum = sumy + sumx;
							if (k + sum < 1000) {
								masu[i][k + sum].y = j[0];
								masu[i][k + sum].x = j[1];
								masu[i][k + sum].time = true;
							}
						}
					}
				}
				

			}

			for (int i = 0; i < 1000; i++) {
				if (masu[max+1][i].time) {
					System.out.println(i);
					break;
				}
			}
		/*	
			for(int i=0;i<=max+1;i++){
				for(int j=0;j<=100;j++){
					System.out.print(masu[i][j].time?" "+j:" F");	
					
				}
				System.out.println();	
			}
			*/
		}
	}

}

class Mapnode {
	int myy;
	int myx;
	int length = 20000;
	String name = "";
	boolean frag = false;
	ArrayList<Integer> listy = new ArrayList<Integer>();
	ArrayList<Integer> listx = new ArrayList<Integer>();
	ArrayList<Mapnode> queue = new ArrayList<Mapnode>();

	public Mapnode(int y, int x) {
		myy = y;
		myx = x;
	}
}

class Masuda {
	int y;
	int x;
	boolean time;

	public Masuda() {
		time = false;
	}
}