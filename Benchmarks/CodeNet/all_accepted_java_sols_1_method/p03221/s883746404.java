import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer,ArrayList> silist = new TreeMap<Integer,ArrayList>();
		String[] ans = new String[m+1];
		int[] cnt = new int[n+1];
		Arrays.fill(cnt,0);
		for(int i = 0; i < m; i++){
			int p = sc.nextInt();
			int y = sc.nextInt();
			silist.put(y,new ArrayList<Integer>(Arrays.asList(p,i)));
		}
		int i = 0;
		for(List<Integer> ii : silist.values()){
			ans[ii.get(1)] = String.format("%06d%06d",ii.get(0),++cnt[ii.get(0)]);
			i++;
		}
		for(i = 0; i < m; i++){
			System.out.println(ans[i]);
		}
	}
}
