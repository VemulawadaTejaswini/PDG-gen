import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int K = sc.nextInt();
		Set<String> S = new HashSet<>();
		for(int i = 0; i < K; i++){
			for(int j = 0; j < s.length()-i; j++)
				S.add(s.substring(j, j + i + 1));
		}
		List<String> list = new ArrayList<>(S);
		Collections.sort(list);
		System.out.println(list.get(K-1));
	}

}