import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int k1 = sc.nextInt();
		for(int tmp = 0; tmp<k1; tmp++) {
			int a1 = sc.nextInt();
			list.add(a1);
		}
		for(int tmp1 = 1; tmp1<n ;tmp1++) {
			List<Integer> compareList = new ArrayList<Integer>();
			int kn = sc.nextInt();
			for(int tmp2 = 0; tmp2<kn ; tmp2++) {
				int a = sc.nextInt();
				compareList.add(a);
			}
			List<Integer> removeList = new ArrayList<Integer>();
			for(int tmp3=0; tmp3< list.size() ; tmp3++) {
				 if(!compareList.contains(list.get(tmp3))){
					 removeList.add(tmp3);
				 }
			}
			Collections.sort(removeList, Collections.reverseOrder());
			for(int tmp4=0; tmp4 < removeList.size(); tmp4++) {
				int index = removeList.get(tmp4);
				list.remove(index);
			}
		}
		System.out.println(list.size());
	}
}