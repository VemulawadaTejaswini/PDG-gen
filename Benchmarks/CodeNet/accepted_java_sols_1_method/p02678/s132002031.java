import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> listArray = new ArrayList<List<Integer>>();
		for (int i=0;i<N+1;i++) {
			List<Integer> temp = new ArrayList<Integer>();
			listArray.add(temp);
		}
		int result[] = new int[N+1];
		list.add(N+1);
		for (int i=0;i<M;i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			if (from ==1) {
				list.add(to);
			} else if (to==1) {
				list.add(from);
			} else {
				List<Integer> temp = listArray.get(from);
				temp.add(to);
				temp = listArray.get(to);
				temp.add(from);
			}
		}
//		Queue<Integer> queue = new ArrayDeque<Integer>();
//		for (int i=0;i<list.size();i++) {
//			queue.add(list.get(i));
//		}
		int count =1;
//		while (queue.isEmpty()!=false) {
//		}
		int before = 0;
		while (list.size()!=0) {
			List<Integer> temp = new ArrayList<Integer> ();
			for (int i=0;i<list.size();i++) {
				if (list.get(i)>N) {
					before = list.get(i)-N;
					continue;
				}
				if (result[list.get(i)]==0) {
					result[list.get(i)] =before;
					temp.add(list.get(i)+N);
					for (int j=0;j<listArray.get(list.get(i)).size();j++) {
						temp.add(listArray.get(list.get(i)).get(j));
					}
				}
			}
			list = temp;
			count ++;
		}
		for (int i=2;i<=N;i++) {
			if (result[i]==0) {
				System.out.println("No");
				System.out.println(i);
				return ;
			}
		}
		System.out.println("Yes");
		for (int i=2;i<=N;i++) {
			System.out.println(result[i]);
		}
	}

}