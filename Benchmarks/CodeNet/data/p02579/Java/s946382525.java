import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int maze[][];
	static 	int maze_x;
	static 	int maze_y;
	static int goal_x;
	static int goal_y;
	static int result;
	static ArrayList<int[]> deque_list = new ArrayList<>();

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		maze_x = sc.nextInt();
		maze_y =sc.nextInt();
		maze = new int[maze_x][maze_y];
		int wiz_x = sc.nextInt()-1;
		int wiz_y = sc.nextInt()-1;
		goal_x = sc.nextInt()-1;
		goal_y = sc.nextInt()-1;


		String tmpString;
		for(int i=0;i<maze_x;i++) {
			tmpString = sc.next();
			for(int j=0;j<tmpString.length();j++) {
				if(tmpString.charAt(j) == '#') {
					maze[i][j] = -2;
				}else {
					maze[i][j] = -1;
				}
			}
		}

		deque_list.add(new int[]{0,wiz_x,wiz_y});

		result = -1;
		while(deque_list.size() != 0) {
			paint_maze(deque_list.get(0));
			if(result != -1) {
				break;
			}

			input_walk(deque_list.get(0));
			input_magic(deque_list.get(0));
			deque_list.remove(0);
		}

		System.out.println(result);

	}
	public static void input_walk(int[] paint_order) {
		if(check_order(paint_order[1]-1,paint_order[2])) {
			deque_list.add(1,new int[]{paint_order[0],paint_order[1]-1,paint_order[2]});
		}

		if(check_order(paint_order[1]+1,paint_order[2])) {
			deque_list.add(1,new int[]{paint_order[0],paint_order[1]+1,paint_order[2]});
		}

		if(check_order(paint_order[1],paint_order[2]-1)) {
			deque_list.add(1,new int[]{paint_order[0],paint_order[1],paint_order[2]-1});
		}

		if(check_order(paint_order[1],paint_order[2]+1)) {
			deque_list.add(1,new int[]{paint_order[0],paint_order[1],paint_order[2]+1});
		}

	}

	public static void input_magic(int[] paint_order) {
		for(int i=-2;i<=2;i++) {
			for(int j=-2;j<=2;j++) {
				if(check_order(paint_order[1]+i,paint_order[2]+j)) {
					deque_list.add(new int[]{paint_order[0]+1,paint_order[1]+i,paint_order[2]+j});
				}
			}
		}
	}

	public static boolean check_order(int x,int y){
		if(x < 0 || x >= maze_x) {
			return false;
		}

		if(y < 0 || y >= maze_y) {
			return false;
		}

		if(maze[x][y] != -1) {
			return false;
		}

		return true;
	}

	public static void paint_maze(int[] paint_order) {
		if(paint_order[1]==goal_x && paint_order[2]==goal_y) {
			result = paint_order[0];
			return;
		}
		maze[paint_order[1]][paint_order[2]] = paint_order[0];
	}

	public static void print_maze() {
		for(int i=0;i<maze_x;i++) {
			for(int j=0;j<maze_y;j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println("");
		}
	}

}
