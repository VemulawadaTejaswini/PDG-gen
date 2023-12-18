import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while (stdin.hasNext()) {
			int w = stdin.nextInt();
			int h = stdin.nextInt();
			if (w == 0 && h == 0) break;
			Maze maze = new Maze(w, h);
			stdin.nextLine();
			maze.setVerticalWalls(0, stdin.nextLine());
			for (int i = 1; i < h; i ++) {
				maze.setHorizontalWalls(i, stdin.nextLine());
				maze.setVerticalWalls(i, stdin.nextLine());
			}
			System.out.println(maze.calculateCost());
		}
		System.exit(0);
	}
}

class Maze {
	private int w, h;
	private Grid[][] grids;
	public Maze(int w, int h) {
		this.w = w;
		this.h = h;
		grids = new Grid[w+1][h+1];
		for (int i = 0; i < w + 1; i ++) {
			for (int j = 0; j < h + 1; j++) {
				grids[i][j] = new Grid();
			}
		}
		for (int i = 0; i < w + 1; i++) {
			grids[i][0].setUpSideWall(true);
			grids[i][h].setUpSideWall(true);
		}
		for (int i = 0; i < h + 1; i++) {
			grids[0][i].setLeftSideWall(true);
			grids[w][i].setLeftSideWall(true);
		}
		grids[0][0].updateCost(1);
	}
	public void setVerticalWalls(int i, String line) {
		String[] wall = line.split(" ");
		for (int j = 1; j < w; j++) {
			grids[j][i].setLeftSideWall(wall[j].equals("1"));
		}
	}
	public void setHorizontalWalls(int i, String line) {
		String[] wall = line.split(" ");
		for (int j = 0; j < w; j++) {
			grids[j][i].setUpSideWall(wall[j].equals("1"));
		}
	}
	public int calculateCost() {
		List<Integer> nextgs = new ArrayList<Integer>();
		if (!grids[1][0].hasLeftSideWall()) {
			nextgs.add(1);
			nextgs.add(0);
			grids[1][0].updateCost(2);
		}
		if (!grids[0][1].hasUpSideWall()) {
			nextgs.add(0);
			nextgs.add(1);
			grids[0][1].updateCost(2);
		}
		return calculateCost(nextgs);
	}
	public int calculateCost(List<Integer> gs) {
		if (gs.size() == 0)
			return 0;
		List<Integer> nextgs = new ArrayList<Integer>();
		Iterator it = gs.iterator();
		while(it.hasNext()) {
			int x = Integer.parseInt(it.next().toString());
			int y = Integer.parseInt(it.next().toString());
			if (x == w - 1 && y == h - 1)
				return grids[x][y].getCost();
			if (!grids[x][y].hasLeftSideWall()) {
				if (grids[x-1][y].updateCost(grids[x][y].getCost() + 1)) {
					nextgs.add(x-1);
					nextgs.add(y);
				}
			}
			if (!grids[x][y].hasUpSideWall()) {
				if (grids[x][y-1].updateCost(grids[x][y].getCost() + 1)) {
					nextgs.add(x);
					nextgs.add(y-1);
				}
			}
			if (!grids[x+1][y].hasLeftSideWall()) {
				if (grids[x+1][y].updateCost(grids[x][y].getCost() + 1)) {
					nextgs.add(x+1);
					nextgs.add(y);
				}
			}
			if (!grids[x][y+1].hasUpSideWall()) {
				if (grids[x][y+1].updateCost(grids[x][y].getCost() + 1)) {
					nextgs.add(x);
					nextgs.add(y+1);
				}
			}

		}
		return calculateCost(nextgs);
	}
}

class Grid {
	private boolean up, left;
	private int cost;
	public Grid(){
		cost = Integer.MAX_VALUE;
	}
	public void setUpSideWall(boolean wall) {
		up = wall;
	}
	public boolean hasUpSideWall() {
		return up;
	}
	public void setLeftSideWall(boolean wall) {
		left = wall;
	}
	public boolean hasLeftSideWall() {
		return left;
	}
	public int getCost() {
		return cost;
	}
	public boolean updateCost(int c) {
		boolean a = cost > c;
		cost = a ? c:cost;
		return a;
	}
}