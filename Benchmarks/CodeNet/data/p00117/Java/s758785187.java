import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int city_number, way_number;
	static int[][] way;
	static int[] Array = new int[4];
	static int start, goal, reward, cost;
	static final int INF = 10000000;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		read();
		slove();
	}
	static boolean read(){
		city_number = sc.nextInt();
		way_number = sc.nextInt();
		way = new int[city_number+1][city_number+1];
		
		for (int i = 0; i <= city_number; i++) {
			Arrays.fill(way[i], INF);
			way[i][i] = 0;
		}
		
		sc.nextLine();

		String line;
		for(int i = 1; i < way_number + 1; i++){
			int a, b, c, d;
			line = sc.nextLine();
			String[] ss = line.split(",");
			a = Integer.parseInt(ss[0].trim());
			b = Integer.parseInt(ss[1].trim());
			c = Integer.parseInt(ss[2].trim());
			d = Integer.parseInt(ss[3].trim());

			way[a][b] = c;
			way[b][a] = d;
		}
		
		line = sc.nextLine();
		String[] aa = line.split(",");
		start = Integer.parseInt(aa[0]);
		goal = Integer.parseInt(aa[1]);
		reward = Integer.parseInt(aa[2]);
		cost = Integer.parseInt(aa[3]);

		return true;
	}
	static void slove(){
		for (int t = 1; t <= city_number; t++) {
			for (int u = 1; u <= city_number; u++) {
				for (int v = 1; v <= city_number; v++) {
					way[u][v] = Math.min(way[u][v], way[u][t] + way[t][v]);
				}
			}
		}

		/*
		for (int u = 1; u <= city_number; u++) {
			for (int v = 1; v <= city_number; v++) {
				System.out.print(way[u][v] + "     ");
			}
			System.out.println();
		}
		*/
		int s = Array[0], g = Array[1], wage = Array[2], f = Array[3]; 
		System.out.println(reward - cost - way[start][goal] - way[goal][start]);
	}

}