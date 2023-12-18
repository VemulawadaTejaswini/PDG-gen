import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	int[][][] ink=new int[][][]{
		null,
		new int[][]{
			new int[]{0,0},
			new int[]{1,0},
			new int[]{0,1},
			new int[]{-1,0},
			new int[]{0,-1}
		},
		new int[][]{
			new int[]{0,0},
			new int[]{1,0},
			new int[]{0,1},
			new int[]{-1,0},
			new int[]{0,-1},
			new int[]{1,1},
			new int[]{-1,1},
			new int[]{-1,-1},
			new int[]{1,-1}
		},
		new int[][]{
				new int[]{0,0},
				new int[]{1,0},
				new int[]{0,1},
				new int[]{-1,0},
				new int[]{0,-1},
				new int[]{1,1},
				new int[]{-1,1},
				new int[]{-1,-1},
				new int[]{1,-1},
				new int[]{2,0},
				new int[]{-2,0},
				new int[]{0,2},
				new int[]{0,-2}
			}
	};
	
	public void run() {
		int[][] map=new int[10][10];
		while (sc.hasNext()) {
			String str=sc.nextLine();
			String[] sa=str.split(",");
			int x=Integer.parseInt(sa[0]);
			int y=Integer.parseInt(sa[1]);
			int size=Integer.parseInt(sa[2]);
			for(int i=0;i<ink[size].length;i++){
				int _x=x+ink[size][i][0];
				int _y=y+ink[size][i][1];
				if(0<=_x&& _x <10 &&0<=_y && _y<10)
					map[_x][_y]++;
			}
		}
		int white=0;int max=0;
		for(int x=0;x<10;x++)
			for(int y=0;y<10;y++){
				if(map[x][y]==0)white++;
				if(max<map[x][y])max=map[x][y];
			}
		ln(white);
		ln(max);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}