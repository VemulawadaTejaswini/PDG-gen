import java.util.*;

public class Main {

	public static void main(String[] args) {
		// make new Scanner.
		Scanner sc = new Scanner(System.in);
//		int n = Integer.parseInt(sc.next());

		List<Integer> list = new ArrayList<Integer>();
		
		list = inList(sc,3);
		
		Collections.sort(list, Comparator.reverseOrder());
		
		int a = list.get(0) - list.get(1) + list.get(1) - list.get(2);
		
		System.out.println(a);
		

		// close Scanner
		sc.close();

	}

	
	/**
	 *  入力した数字を配列に格納するメソッド.
	 * @param sc
	 * @param n
	 * @return
	 */
	public static List<Integer> inList(Scanner sc, int n) {
		List<Integer> list = new ArrayList<Integer>();
		for (int a=0;a<n;a++) {
			list.add(sc.nextInt());
		}
		return list;
	}
	
	/**
	 *  入力した数字を配列に格納するメソッド.
	 * @param sc
	 * @param n
	 * @return
	 */
	public static List<Long> inLongList(Scanner sc, int n) {
		List<Long> list = new ArrayList<Long>();
		for (int a=0;a<n;a++) {
			list.add(sc.nextLong());
		}
		return list;
	}
	
	
	/**
	 *   リストの数字の美しさを求める.
	 */
	public static int beautyList(List<Integer> list, int d) {
		int a=0;
		for (int b=0;b<= list.size(); b++) {
			if (Math.abs(list.get(b) - list.get(b+1)) ==d) {
				a++;
			}
		}
		return a;
	}
	
	public static String judge(List<Long> list) {
		Long a =list.get(0);
		Long b =list.get(1);
		Long c =list.get(2);
		Long d =list.get(3);
		
		if (a < b
				|| b > d)
				{
			return "No";
		}
		if (a-b < b) {
			if (a-b > c) {
				return "No";
			} else if (b ==d) {
				return "Yes";
			}
		}
		if (b % 2 == 0) {
			if (b*2 <= c+d) {
				return "Yes";
			} else {
				return "No";
			}
		} else {
			if (b*2 < c+d) {
				return "Yes";
			} else {
				return "No";
			}
		}
	}

}
