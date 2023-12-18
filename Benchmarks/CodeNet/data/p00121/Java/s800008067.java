import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] init = {0, 1, 2, 3, 4, 5, 6, 7};
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(encode(init), 0);
		ArrayDeque<int[]> que = new ArrayDeque<int[]>();
		que.add(init);
		
		while (!que.isEmpty()) {
			int[] arr = que.remove();
			int[][] swap = {{0,1},{1,2},{2,3},{4,5},{5,6},{6,7},{0,4},{1,5},{2,6},{3,7}};
			for (int[] ij: swap) {
				int i = ij[0], j = ij[1];
				if (arr[i] == 0 || arr[j] == 0) {
					int[] _arr = arr.clone();
					_arr[i] = arr[j];
					_arr[j] = arr[i];
					if (!map.containsKey(encode(_arr))) {
						map.put(encode(_arr), map.get(encode(arr)) + 1);
						que.add(_arr);
					}
				}
			}
		}
		
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int[] arr = new int[8];
			for (int i = 0; i < 8; i++) {
				arr[i] = in.nextInt();
			}
			System.out.println(map.get(encode(arr)));
		}
	}
	
	static int encode(int[] arr) {
		int code = 0;
		for (int n: arr) {
			code = code << 3 + n;
		}
		return code;
	}
}