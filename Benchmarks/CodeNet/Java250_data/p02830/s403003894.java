import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String[] ss = S.split("", 0);
		String T = sc.next();
		String[] ts = T.split("", 0);
		StringBuilder sb = new StringBuilder();
		for (int n = 0; n < N; n++){
			sb.append(ss[n]);
			sb.append(ts[n]);
		}
		System.out.println(new String(sb));
	}}