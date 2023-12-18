import java.util.Arrays;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){
		Ink l = Ink.LARGE;
		Ink m = Ink.MIDDLE;
		Ink s = Ink.SMALL;
		Paper p = new Paper(10);
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			Scanner scstr = new Scanner(sc.nextLine());
			scstr.useDelimiter(",");
			
			int x = scstr.nextInt();
			int y = scstr.nextInt();
			Ink i = null;
			int ink_size = scstr.nextInt();
			if(ink_size == 1) i = s;
			else if(ink_size == 2) i = m;
			else if(ink_size == 3) i = l;
			
			p.drop(x, y, i);
			scstr.close();
		}
		System.out.println(p.countWhiteCells());
		System.out.println(p.maxDensity());
		sc.close();
	}
	
}

class Paper{
	int[][] paper;
	
	Paper(int size){
		this.paper = new int[size][size];
		for(int[] row: this.paper) {
			Arrays.fill(row, 0);
		}
	}
	
	void drop(int x, int y, Ink ink) {
		for(int i = 0; i < ink.range.length; i++) {
			for(int j = 0; j < ink.range.length; j++) {
				if(ink.range[i][j]) paint(this.paper, x - ink.center_x + i, y - ink.center_y + j);
			}
		}
	}
	
	void paint(int[][] paper, int x, int y) {
		if(0 <= x && x < paper.length && 0 <= y && y < paper.length) paper[x][y]++;
	}
	
	int countWhiteCells() {
		int result = 0;
		for(int[] i: paper) {
			for(int j: i) {
				if(j == 0) result++;
			}
		}
		return result;
	}
	
	int maxDensity() {
		int max = 0;
		for(int[] i: paper) {
			for(int j: i) {
				if(j > max) max = j;
			}
		}
		return max;
	}
	
}

enum Ink{
	SMALL(new boolean[][] {
			{false,	true,	false},
			{true,	true,	true},
			{false,	true,	false}
	}, 1, 1), 
	
	MIDDLE(new boolean[][] {
			{true,	true,	true},
			{true,	true,	true},
			{true,	true,	true}
	}, 1, 1), 
	
	LARGE(new boolean[][] {
			{false,	false,	true,	false,	false},
			{false,	true,	true,	true,	false},
			{true,	true,	true,	true,	true},
			{false,	true,	true,	true,	false},
			{false,	false,	true,	false,	false}
	}, 2, 2);
	
	boolean[][] range;
	int center_x;
	int center_y;
	
	private Ink(boolean[][] range, int center_x, int center_y) {
		this.range = range;
		this.center_x = center_x;
		this.center_y = center_y;
	}
}