import java.util.*;
public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int[] s_count = new int [26];
		int[] min_count = new int[26];
		Arrays.fill(min_count, 999);
		String s;

		for (int i = 0;i < n; ++i){
			s = scan.next();
			Arrays.fill(s_count, 0);
			for(char k :s.toCharArray()){
				s_count[k-97]+=1;
			}

			for (int k = 0;k < 26; ++k){
				min_count[k]=Math.min(s_count[k], min_count[k]);
			}
		}

		for (int i = 0;i < 26; ++i){
				for (int k = 0;k < min_count[i]; ++k){
					System.out.print(String.valueOf((char)(i+97)));
			}
		}
	}
}
//end
