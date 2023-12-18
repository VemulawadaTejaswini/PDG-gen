import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		if (N == 1) {
			System.out.println(1);
			return;
		}
		Collections.sort(list);
		int[] ar = new int[1000001];
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			int x = num;
			if (ar[x] != 0) {
				ar[x]++;
				break;
			}
			int index = 2;
			while (x < 1000001) {
				ar[x]++;
				x = num * index;
				index++;
			}
		}
		long count = 0;
		for (Integer i : list) {
			if (ar[i] == 1) {
				count++;
			}
		}
		System.out.println(count);
	}
}