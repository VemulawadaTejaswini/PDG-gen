import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int ans = 0;
		for(int n=2; n<N; n++) {
			int tmp=0;
			ArrayList Xlist = new ArrayList();
			for(int i=0;i<n;i++) {
				if(!Xlist.contains(S.charAt(i)))
					Xlist.add(S.charAt(i));
			}
			String Y = S.substring(n, N);
			for(int i=n;i<N;i++) {
				if(Xlist.contains(S.charAt(i))) {
					tmp++;
					Xlist.remove(Xlist.indexOf(S.charAt(i)));
				}
			}
			if(ans<tmp)
				ans = tmp;
		}
		System.out.println(ans);
	}
}
