

import java.util.*;
import java.lang.*;


public class Main {
	private final static int MAX_QUEENS = 8;
	private static boolean[] row = new boolean[MAX_QUEENS];
	private static boolean[] col = new boolean[MAX_QUEENS];
	private static boolean[] dpos = new boolean[MAX_QUEENS*2 - 1];
	private static boolean[] dneg = new boolean[MAX_QUEENS*2 - 1];
	private static boolean[][] PieceBoard = new boolean[MAX_QUEENS][MAX_QUEENS];
	private static boolean[][] Fixed = new boolean[MAX_QUEENS][MAX_QUEENS];
	private static boolean done;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int b, c;
		for(int i = 0;i< a;i++) {
			b = sc.nextInt();
			c = sc.nextInt();
			
			Queen(b,c);
		}
		
		if(has_fixed(0))
			printBoard();
		
	}
	private static boolean has_fixed(int i) {
		// TODO Auto-generated method stub'
		
		if(i == MAX_QUEENS)
			return done=true;
		
		for(int j = 0; j< MAX_QUEENS;j++) {
			if(col[j] || dpos[i+j] || dneg[i-j+MAX_QUEENS-1])
				if(!if_Queen(i,j))
					continue;
			
			if(!if_fixed(i,j))
				putQ(i,j);
			
			if(has_fixed(i+1))
				return done;
			
			if(!if_fixed(i,j))
				take_queen(i,j);
		}
		
		return false;
	}
	private static void take_queen(int i, int j) {
		// TODO Auto-generated method stub
		if(if_Queen(i,j)) {
			PieceBoard[i][j] = false;
			row[i] = col[j] = dpos[i+j] = dneg[i -j +MAX_QUEENS -1] = false;
		}
		
	}
	private static boolean if_fixed(int i, int j) {
		// TODO Auto-generated method stub
		return Fixed[i][j];
	}
	private static void printBoard() {
		// TODO Auto-generated method stub
		StringBuilder build = new StringBuilder();
		
		for(int i=0; i< MAX_QUEENS; i++) {
			for(int j = 0; j< MAX_QUEENS; j++) {
				build.append(if_Queen(i,j)?"Q":".");
			}
			build.append("\n");
		}
		System.out.print(build);
	}
	private static void Queen(int b, int c) {
		// TODO Auto-generated method stub
		putQ(b,c);
		Fixed[b][c] = true;
	}
	private static boolean putQ(int r, int c) {
		// TODO Auto-generated method stub
		if(if_Queen(r,c))
			return false;
		if(row[r] || col[c] || dpos[r+c] || dneg[r-c+MAX_QUEENS - 1])
			return false;
		
		PieceBoard[r][c] = true;
		row[r] = col[c] = dpos[r+c] = dneg[r-c+MAX_QUEENS-1] = true;
		
		return true;
		
	}
	private static boolean if_Queen(int b, int c) {
		// TODO Auto-generated method stub
		
		return PieceBoard[b][c];
	}

}

