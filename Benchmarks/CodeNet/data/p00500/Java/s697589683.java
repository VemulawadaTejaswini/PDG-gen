//package kadai3;
import java.util.*;
public class Main {
	public boolean overlap(int[][] table, int h, int v) { 
		for(int i = 0; i < table.length; i++) {
			if(table[h][v] == table[i][v] && i != h) return true;
		}
		return false;
	}
	void doIt() {
		Scanner sc = new Scanner(System.in);
		Main check = new Main();
		int N = sc.nextInt();
		int[] point = new int[N];
		int[][] num = new int[N][3]; 
		for(int i = 0; i < N; i++) {
			num[i][0] = sc.nextInt();
			num[i][1] = sc.nextInt(); 
			num[i][2] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < N; j++) {
				if(!check.overlap(num, j, i)) point[j] += num[j][i];
			}
		}
		for(int i = 0; i < N; i++) System.out.println(point[i]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}