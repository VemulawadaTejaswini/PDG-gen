import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			Train[] trains = new Train[n];
			for (int i = 0; i < n; i++) {
				String depstr = sc.next();
				String[] depstrs = depstr.split(":");
				int dep = Integer.parseInt(depstrs[0]) * 3600
						+ Integer.parseInt(depstrs[1]) * 60
						+ Integer.parseInt(depstrs[2]);
				String arrstr = sc.next();
				String[] arrstrs = arrstr.split(":");
				int arr = Integer.parseInt(arrstrs[0]) * 3600
						+ Integer.parseInt(arrstrs[1]) * 60
						+ Integer.parseInt(arrstrs[2]);
				trains[i] = new Train(dep, arr);
			}
			int max = 0;
			Arrays.sort(trains);
			for (int i = 0; i < n; i++) {
				int r = 0;
				for (int j = i; j < n; j++) {
					if (trains[i].arr > trains[j].dep)
						r++;
				}
				max = Math.max(max, r);
			}
			System.out.println(max);
		}
		sc.close();
	}
}

class Train implements Comparable<Object> {
	int dep;
	int arr;

	Train(int d, int a) {
		dep = d;
		arr = a;
	}

	public int compareTo(Object t) {
		Train other = (Train) t;
		return dep - other.dep;
	}
}