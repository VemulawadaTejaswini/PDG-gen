import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int dataSet, x, y, w, h, catNumber;
	static int[][] point;
	public static void main(String[] args) {
		dataSet = sc.nextInt();
		for(int i = 0; i < dataSet; i++){
			read();
			System.out.println(solve());
		}
	}
	static void read(){
		x = sc.nextInt();
		y = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		catNumber = sc.nextInt();
		point = new int[2][catNumber];
		for(int i = 0; i < catNumber; i++){
			point[0][i] = sc.nextInt();
			point[1][i] = sc.nextInt();
		}
	}
	static int solve(){
		int count = 0;
		for(int i = 0; i < catNumber; i++){
			if(point[0][i] >= x && point[0][i] <= x+w && 
					point[1][i] >= y && point[1][i] <= y+h)
				count++;
		}
		return count;
	}

}