
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Point[] points = new Point[n];
		for(int i = 0; i < n; i++){
			points[i] = new Point(sc.nextInt(), sc.nextInt());
		}

		Arrays.sort(points);

		long result = 0;

		for(int i = 0; i < n; i++){
			for(int j = n - 1; j > i; j--){
				if(points[j].x + points[j].y < result){
					break;
				}

				int dx = points[j].x - points[i].x;
				int dy = points[j].y - points[i].y;

				result = Math.max(dx + dy, result);
			}
		}

		System.out.println(result);
	}
}

class Point implements Comparable<Point>{
	int x;
	int y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Point p) {
		// TODO 自動生成されたメソッド・スタブ
		return (this.x + this.y) - (p.x + p.y);
	}


}