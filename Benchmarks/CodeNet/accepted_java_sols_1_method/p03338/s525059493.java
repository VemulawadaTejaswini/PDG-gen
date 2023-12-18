import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String s = sc.next();

		int ans = 0;
		for (int i=0; i<N; i++){
			String s_l = s.substring(0, i);
			char[] s_l_array = s_l.toCharArray();
			HashSet<Character> s_l_set = new HashSet<Character>();
			for (int j=0; j<s_l_array.length; j++){
				s_l_set.add(s_l_array[j]);
			}
			ArrayList<Character> s_l_arrayList = new ArrayList<Character>(s_l_set);

 			String s_r = s.substring(i);
 			char[] s_r_array = s_r.toCharArray();
			HashSet<Character> s_r_set = new HashSet<Character>();
			for (int j=0; j<s_r_array.length; j++){
				s_r_set.add(s_r_array[j]);
			}

			int tmp = 0;
			for (int j=0; j<s_l_arrayList.size(); j++){
				if (s_r_set.contains(s_l_arrayList.get(j))){
					tmp += 1;
				}
			}

			if (tmp > ans){
				ans = tmp;
			}
		}
		System.out.println(ans);
	}
}