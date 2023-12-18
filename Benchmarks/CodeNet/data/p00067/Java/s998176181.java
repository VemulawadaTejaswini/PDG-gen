import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[][] map = null;
		out: while(sc.hasNextLine()){
			map = new int[12][12];
			for(int i = 0; i < 12; i++){
				String line = sc.nextLine();
				if(line.equals("")) continue out;
				for(int j = 0; j < 12; j++){
					map[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
				}
			}
			IslandMap im = new IslandMap(map);
			System.out.println(im.countIsland());
		}
		sc.close();
		

	}
	
}

class IslandMap{
	boolean[][] land;
	int[][] islandNo;
	
	public IslandMap(int[][] map) {
		//init1
		land = new boolean[map.length][map[0].length];
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				land[i][j] = (map[i][j] == 1)? true: false;
			}
		}
		
		islandNo = new int[map.length][map[0].length];

		//init2
		int i_num = 1;
		for(int i = 0; i < islandNo.length; i++) {
			for(int j = 0; j < islandNo[i].length; j++) {
				if(land[i][j]) {
					if(minNW(i, j) != 0) islandNo[i][j] = minNW(i, j);
					else islandNo[i][j] = i_num++;
				}else islandNo[i][j] = 0;
			}
		}
		
		//reflesh
		int[][] past;
		do{
			past = copyOf(islandNo);
			reflesh();
		}while(!equals(islandNo, past));
	}
	
	//if (north of(i, j) == 1) return (north islandNo) else return 0
	private int north(int i, int j) {
		if(i-1 >= 0) return islandNo[i-1][j];
		else return 0;
	}
	
	private int south(int i, int j) {
		if(i + 1 < islandNo.length) return islandNo[i+1][j];
		else return 0;
	}

	private int west(int i, int j) {
		if(j - 1 >= 0) return islandNo[i][j-1];
		else return 0;
	}
	
	private int east(int i, int j) {
		if(j + 1 < islandNo[i].length) return islandNo[i][j+1];
		else return 0;
	}
	
	private int minNW(int i, int j) {
		int north = north(i, j);
		int west = west(i, j);
		if(north != 0) {
			if(west != 0) return north < west? north: west;
			else return north;
		}else return west != 0? west: 0;
	}
	
	//return (n, s, e, w) != (0, 0, 0, 0)? min(n, s, e, w): 0
	private int minNSEW(int i, int j) {
		int north = (north(i, j) != 0)? north(i, j): Integer.MAX_VALUE;
		int south = (south(i, j) != 0)? south(i, j): Integer.MAX_VALUE;
		int west = (west(i, j) != 0)? west(i, j): Integer.MAX_VALUE;
		int east = (east(i, j) != 0)? east(i, j): Integer.MAX_VALUE;
		int result = min(north, south, east, west);
		return result == Integer.MAX_VALUE? 0: result;
	}
	
	private int min(int... i) {
		int result = Integer.MAX_VALUE;
		for(int j: i) {
			if(j < result) result = j;
		}
		return result;
	}
	
	/*  1 0 2		1 0 2
	 *  1 0 2	->	1 0 1
	 *  1 1 1		1 1 1
	 */
	private void reflesh() {
		for(int i = 0; i < islandNo.length; i++) {
			for(int j = 0; j < islandNo[i].length; j++) {
				if(land[i][j]) {
					if(minNSEW(i, j) != 0) islandNo[i][j] = minNSEW(i, j);
				}
			}
		}
	}
	
	private static boolean equals(int[][] a1, int[][] a2) {
		for(int i = 0; i < a1.length; i++) {
			for(int j = 0; j < a1[i].length; j++) {
				if(a1[i][j] != a2[i][j]) return false;
			}
		}
		return true;
	}
	
	private static int[][] copyOf(int[][] original){
		int[][] result = new int[original.length][original[0].length];
		for(int i = 0; i < original.length; i++	) {
			result[i] = Arrays.copyOf(original[i], original[i].length);
		}
		return result;
	}
	
	public void show() {
		for(int[] row: islandNo) {
			for(int i: row){
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public int countIsland() {
		HashSet<Integer> result = new HashSet<>();
		for(int[] row: islandNo) {
			for(int i: row) {
				if(!result.contains(i) && i != 0) result.add(i);
			}
		}
		return result.size();
	}
}