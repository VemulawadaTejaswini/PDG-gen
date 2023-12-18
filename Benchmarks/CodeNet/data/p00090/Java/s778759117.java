import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	double[][] map;

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			int lines = Integer.parseInt(sc.nextLine());
			if (lines == 0) break;

			double[] x = new double[lines];
			double[] y = new double[lines];
			for (int i = 0; i < lines; i++) {
				String[] nico = sc.nextLine().split(",");
				x[i] = Double.parseDouble(nico[0]);
				y[i] = Double.parseDouble(nico[1]);
			}
			
			map = new double[lines][lines];
			for (int i = 0; i < lines; i++) {
				for (int j = 0; j < lines; j++) {
					double d = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
					map[i][j] = d;
					map[j][i] = d;
				}
			}
			
			int max = 0;
			for (int i = 0; i < lines; i++) {
				ArrayList<Integer> nodes = new ArrayList<Integer>();
				nodes.add(i);
				
				int tmp = dfs(nodes);
				if (max < tmp) max = tmp;
			}
			System.out.println(max);
		}
	}
	
	private int dfs(ArrayList<Integer> nodes) {
		int max = 0;
		for (int i = nodes.get(nodes.size() - 1); i < map.length; i++) {
			int j = 0;
			for (j = 0; j < nodes.size(); j++) {
				if (map[nodes.get(j)][i] >= 2.0) break;
			}
			
			int tmp = 0;
			if (j == nodes.size()) tmp = dfs(nodes);
			if (max < tmp) max = tmp;
		}
		
		return max + 1;
	}
}