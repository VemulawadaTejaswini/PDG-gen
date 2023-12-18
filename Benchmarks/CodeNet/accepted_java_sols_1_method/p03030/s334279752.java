import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = new String[N];
		int[] P = new int[N];
		int[] index = new int[N];
		TreeMap<String,Integer> shop = new TreeMap<String,Integer>();
		String[] ans = new String[N];
		for (int i=0;i<N;i++) {
			S[i]=sc.next();
			P[i]=sc.nextInt();
			shop.put(S[i],i);
			index[i]=i+1;
			ans[i]=S[i]+"_"+String.valueOf(1900-P[i])+"_"+String.valueOf(index[i]);
		}
		Arrays.sort(ans);
		for (int i=0;i<N;i++) {
			String[] str = ans[i].split("_");
			System.out.println(str[2]);
		}
	}
}