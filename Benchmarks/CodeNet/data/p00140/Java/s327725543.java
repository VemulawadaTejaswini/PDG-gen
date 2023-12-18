import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] stop = new int[]{0,1,2,3,4,5,6,7,8,9,5,4,3,2,1};

		while(n-- > 0){
			int s = sc.nextInt();
			int g = sc.nextInt();

			int idx;
			for(idx=0;stop[idx]!=s;idx++);
			ArrayList<Integer> r1 = getRoute(stop,idx,s,g);
			for(idx=stop.length-1;stop[idx]!=s;idx--);
			ArrayList<Integer> r2 = getRoute(stop,idx,s,g);

			ArrayList<Integer> ans = r1.size() < r2.size() ? r1 : r2;
			for(int i=0;i<ans.size()-1;i++){
				System.out.print(ans.get(i) + " ");
			}
			System.out.println(ans.get(ans.size()-1));
		}
	}

	private static ArrayList<Integer> getRoute(int[] stop,int idx,int s,int g){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=idx;stop[i]!=g;i=(i+1)%stop.length){
			res.add(stop[i]);
		}
		res.add(g);
		return res;
	}
}