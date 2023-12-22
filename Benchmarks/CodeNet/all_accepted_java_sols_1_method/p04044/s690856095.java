import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		String[] str = new String[N];
		int L = scn.nextInt();
		for (int i = 0; i < N; i++) {
			str[i] = scn.next();
		}
		for (int i = 0; i < L; ++i) {
			for (int j = i + 1; j < N; ++j) {
				if (str[i].compareTo(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		Arrays.sort(str);
		String ans = "";
		for (int i = 0; i < N; i++) {
			ans = ans + str[i];
		}
		System.out.println(ans);
	}
}