import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long y = scan.nextLong();
		scan.close();
//		long smaller = Math.min(x, y);
//		long bigger = Math.max(x, y);
		ArrayList<Integer> x_cd = new ArrayList<Integer>();
		ArrayList<Integer> y_cd = new ArrayList<Integer>();
		x_cd = Divisor(x);
		y_cd = Divisor(y);
//		x_cd = Divisor(smaller);
//		y_cd = Divisor(Math.floorMod(bigger, smaller));
		int max = 0;
		for(int i = 0; i < x_cd.size(); i++){
			for(int j = 0; j < y_cd.size(); j++){
				if(x_cd.get(i).equals(y_cd.get(j))){	//==?????¨125????????£???????????????????????????
					if(max < x_cd.get(i)){
						max = x_cd.get(i);
					}
					break;
				}
			}
		}
		System.out.println(max);
	}

	static ArrayList<Integer> Divisor(long x){
		ArrayList<Integer> Divisor = new ArrayList<Integer>();
		for(int d = 1; d <= x; d++){
			if(Math.floorMod(x, d) == 0){
				Divisor.add(d);
			}
		}
		return Divisor;
	}
}