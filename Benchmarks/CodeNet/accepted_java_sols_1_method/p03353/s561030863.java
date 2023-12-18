import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int K = sc.nextInt();

		List<String> firstList = Arrays.asList(s.split(""));

		Set<String> set = new HashSet<String>();

		for (int i=0; i<s.length(); i++) {
			for (int e=i+1; e<=i+K && e<s.length()+1; e++) {
				set.add(s.substring(i,e));
			}
		}

		List<String> subStrList = new ArrayList<>(set);
		Collections.sort(subStrList);
		System.out.println(subStrList.get(K-1));
	}
}

