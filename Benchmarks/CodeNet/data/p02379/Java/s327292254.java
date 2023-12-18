import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			double x1 = sc.nextDouble();		//P1とP2の座標を入力
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double distance = GetDistance (x1,y1,x2,y2);
			System.out.println(distance);
		}
	}

	public static double GetDistance (double x1, double y1, double x2, double y2) {		//二点間の距離を求めるメソッド
		double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));				//Math.sprtで平方根を求める
		return d;
	}

}

