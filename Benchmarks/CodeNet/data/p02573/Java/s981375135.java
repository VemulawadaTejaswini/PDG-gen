	import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
	
	public class Main {
		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			List<Set<Integer>> groups = new ArrayList<Set<Integer>>();
			for (int i = 0; i < m; i++) {
				sc.nextLine();
				int a = sc.nextInt();
				int b = sc.nextInt();
				boolean belonga = false;
				boolean belongb = false;
				for (Set<Integer> list : groups) {
					if (list.contains(a) && list.contains(b)) {
						belonga = true;
						belongb = true;
					} else  if (list.contains(a)) {
						belonga = true;
						belongb = true;
						list.add(b);
					} else if (list.contains(b)) {
						belonga = true;
						belongb = true;
						list.add(a);
					}
				}
				if (!belonga) {
					Set<Integer> newgroup = new HashSet<Integer>();
					newgroup.add(a);
					newgroup.add(b);
					groups.add(newgroup);
				}
			}
			for (Set<Integer> list : groups) {
				for (Integer ele : list) {
					for (Set<Integer> one : groups) {
						if (one.contains(ele)) {
							list.addAll(one);
						}
					}
				}
			}
			int max = 0;
			for (Set<Integer> list : groups) {
				if (max < list.size()) {
					max = list.size();
				}
			}
			System.out.println(max);
		}
		
	}
