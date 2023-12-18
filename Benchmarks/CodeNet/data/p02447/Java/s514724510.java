import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		int n=Integer.parseInt(src.next());

		List<PointXY> list = new ArrayList<>();

		for (int i=0; i<n; i++) {
			list.add(new PointXY(Integer.parseInt(src.next()), Integer.parseInt(src.next())));
		}

		list.sort(Comparator.comparingInt(PointXY :: getX).thenComparingInt(PointXY :: getY));

		for(int i=0; i<n; i++) {

			System.out.println(list.get(i).x + " " + list.get(i).y);

		}

	}
}


class PointXY{

	int x, y;

	PointXY(int a, int b){

		x = a;
		y = b;

	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}
}
