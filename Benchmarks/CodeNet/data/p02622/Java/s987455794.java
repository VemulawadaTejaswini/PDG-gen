import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder S = new StringBuilder(sc.next());
		String T = sc.next();
		sc.close();
		int i=0;
		int ans = 0;
		while(!T.equals(S.toString())){
			if(T.charAt(i)!=S.charAt(i)){
				S.setCharAt(i, T.charAt(i));
				ans++;
			}
			i++;
		}
		System.out.println(ans);
	}
}
