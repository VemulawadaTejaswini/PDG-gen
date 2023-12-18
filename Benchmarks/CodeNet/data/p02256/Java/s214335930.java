import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		ArrayList<Integer> x_cd = new ArrayList<Integer>();
		ArrayList<Integer> y_cd = new ArrayList<Integer>();
		x_cd = CommonDivisor(x);
		y_cd = CommonDivisor(y);
		int max = 0;
		for(int i = 0; i < x_cd.size(); i++){
			for(int j = 0; j < y_cd.size(); j++){
				if(x_cd.get(i) == y_cd.get(j) && max < x_cd.get(i)){
					max = x_cd.get(i);
				}
			}
		}
		System.out.println(max);
	}

	static ArrayList<Integer> CommonDivisor(int x){
		ArrayList<Integer> CommonDivisor = new ArrayList<Integer>();
		for(int d = 1; d <= x; d++){
			if(Math.floorMod(x, d) == 0){
				CommonDivisor.add(d);
			}
		}
		return CommonDivisor;
	}
}