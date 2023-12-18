import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		int dotcount =Integer.parseInt(scr.nextLine());
		dots = new int[dotcount][];
		for(int i=0; i<dotcount; i++){
			String[] str = scr.nextLine().split(" ", 0);
			dots[i] = new int[Integer.parseInt(str[1])];
			for(int j=2; j<str.length; j++){
				dots[i][j-2] = Integer.parseInt(str[j])-1;
			}
		}
		step=1;
		//index=0;
		start = new int[dotcount];
		finish = new int[dotcount];
		visited = new boolean[dotcount];
		for(int i=0; i<dotcount; i++){
			visited[i] = false;
		}
		Visit(0);
		for(int i=0; i<dotcount; i++){
			System.out.println(String.valueOf(i+1) +" "+ start[i] +" "+ finish[i]);
		}
		scr.close();
	}
	static int[][] dots;
	static int step;
	//static int index;
	static boolean[] visited;
	static int[] start;
	static int[] finish;
	static void Visit(int i){
		visited[i] = true;
		start[i] = step;
		step++;
		for(int j=0; j < dots[i].length; j++){
			if(!visited[dots[i][j]]) Visit(dots[i][j]);
		}
		finish[i] = step;
		step++;
	}
}