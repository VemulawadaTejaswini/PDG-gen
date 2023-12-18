import java.awt.geom.*;
import java.io.*;
import java.util.*;

public class Main{
	int [] dp;
	int max = 1000;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int sum = 0;
			for(int i = 0 ; i < n; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int h = sc.nextInt();
				int w = sc.nextInt();
				int size = x + y + h;
				int res = calc(size, w);
				sum += res;
			}
			System.out.println(sum);
		}
	}

	private int calc(int size, int w) {
		if(size <= 60 && w <= 2){
			return 600;
		}
		if(size <= 80 && w <= 5){
			return 800;
		}
		if(size <= 100 && w <= 10){
			return 1000;
		}
		if(size <= 120 && w <= 15){
			return 1200;
		}
		if(size <= 140 && w <= 20){
			return 1400;
		}
		if(size <= 160 && w <= 25){
			return 1600;
		}
		return 0;
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}