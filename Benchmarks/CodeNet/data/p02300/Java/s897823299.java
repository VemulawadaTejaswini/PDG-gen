import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Vector2d> p = new ArrayList<>();
		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			p.add(new Vector2d(x, y));
		}
		sc.close();
		printAns(solve(p));
	}

	static class Vector2d {
		Vector2d(int x, int y){
			this.x = x;
			this.y = y;
		}
		int x;
		int y;
		public String toString() {
			return String.format("%d %d", x, y);
		}

		public static Vector2d sub(Vector2d v1, Vector2d v2){
			return new Vector2d(v2.x - v1.x, v2.y - v1.y);
		}

		// 3点が反時計回りになっているならばtrue
		public static boolean isCounterClockwise(Vector2d v1, Vector2d v2, Vector2d v3) {
			Vector2d a = sub(v1, v2);
			Vector2d b = sub(v1, v3);
			double angle = a.x * b.y - a.y * b.x;
			return angle >= 0;
		}

	}

	static class Vector2dComparator implements Comparator<Vector2d>{
		@Override
		public int compare(Vector2d v1, Vector2d v2) {
			int y = v1.y - v2.y;
			if (y == 0) {
				return v1.x - v2.x;
			}
			return y;
		}
	}

	public static List<Vector2d> solve(List<Vector2d> p) {
		int s = p.size();
		p.sort(new Vector2dComparator());
		// 凸包
		// 右部凸包
		List<Vector2d> ansR = new ArrayList<>();
		ansR.add(p.get(0));
		ansR.add(p.get(1));
		for(int i=2; i<s; i++) {
			ansR.add(p.get(i));
			// ansRが3点以上含み、
			// 最後の3点が反時計回りになってない
			while(ansR.size() >= 3 && !Vector2d.isCounterClockwise(ansR.get(ansR.size()-3), ansR.get(ansR.size()-2), ansR.get(ansR.size()-1))) {
				ansR.remove(ansR.size()-2);
			}
		}
		// 左部凸包
		List<Vector2d> ansL = new ArrayList<>();
		ansL.add(p.get(s-1));
		ansL.add(p.get(s-2));
		for(int i=s-3; i>=0; i--) {
			ansL.add(p.get(i));
			// ansLが3点以上含み、
			// 最後の3点が反時計回りになってない
			while(ansL.size() >= 3 && !Vector2d.isCounterClockwise(ansL.get(ansL.size()-3), ansL.get(ansL.size()-2), ansL.get(ansL.size()-1))) {
				ansL.remove(ansL.size()-2);
			}
		}
		// ansRとかぶる点を除去
		ansL.remove(ansL.size()-1);
		ansL.remove(0);
		// 左右の凸包を合体
		ansR.addAll(ansL);
		return ansR;
	}

	public static void printAns(List<Vector2d> l) {
		for (int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
}

