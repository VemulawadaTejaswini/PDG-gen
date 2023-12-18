import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		for (int c = 1; ; c++) {
			int W = Integer.parseInt(br.readLine());
			if (W == 0) break;
			int N = Integer.parseInt(br.readLine());
//			int[] v = new int[N];
//			int[] w = new int[N];
			LinkedList<Integer> v = new LinkedList<>();
			LinkedList<Integer> w = new LinkedList<>();
			for (int i=0; i < N; i++) {
				String[] temp = br.readLine().split(",");
				v.add( Integer.parseInt(temp[0]) );
				w.add( Integer.parseInt(temp[1]) );
			}

			int[] ans = minimax(v, w, W);
			System.out.println("Case " + c + ":");
			System.out.println(ans[0]);
			System.out.println(ans[1]);
		}
	}

	public static int[] minimax(
			LinkedList<Integer> value, LinkedList<Integer> weight, int maxW) {
		int[] ret = new int[2];
//		int[] first = {value.get(0), weight.get(0)};
		if (value.size() == 1 && weight.size() == 1) {
			if (weight.get(0) <= maxW) {
				ret[0] = value.get(0);
				ret[1] = weight.get(0);
				return ret;
			} else {
				ret[0] = ret[1] = 0;
				return ret;
			}
		}

		LinkedList<Integer> removeFirstValue = new LinkedList<>();
		LinkedList<Integer> removeFirstWeight = new LinkedList<>();
		for (int i=1; i < value.size(); i++) {
			removeFirstValue.add(value.get(i));
			removeFirstWeight.add(weight.get(i));
		}

		int v2 = minimax(removeFirstValue, removeFirstWeight, maxW)[0];
		int w2 = minimax(removeFirstValue, removeFirstWeight, maxW)[1];
		if (maxW-weight.get(0) < 0) {
			ret[0] = v2;
			ret[1] = w2;
			return ret;
		}
		int v1 = value.get(0) + minimax(removeFirstValue, removeFirstWeight, maxW-weight.get(0))[0];
		int w1 = weight.get(0) + minimax(removeFirstValue, removeFirstWeight, maxW-weight.get(0))[1];


		if (v1 > v2) {
			ret[0] = v1;
			ret[1] = w1;
			return ret;
		} else if (v1 < v2) {
			ret[0] = v2;
			ret[1] = w2;
			return ret;
		} else {
			ret[0] = v1;
			ret[1] = Math.min(w1, w2);
			return ret;
		}
	}
}