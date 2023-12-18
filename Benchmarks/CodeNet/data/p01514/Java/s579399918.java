import java.util.*;
class Main{
	public static void main(String[] a){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int T = in.nextInt(), P = in.nextInt(), R = in.nextInt();
			if(T==0&&P==0&&R==0) break;
			List<int[]> l = new ArrayList<int[]>();
			for(int i = 0; i < T; i++) {
				int[] xxx = new int[4];
				xxx[0] = i+1;
				l.add(xxx);
			}
			for(int i = 0; i < R; i++){
				int it = in.nextInt(), ip = in.nextInt(), itime = in.nextInt();
				int[] arr = l.get(it-1);
				if(!"WRONG".equals(in.next())) {
					arr[1]++;
					arr[2]+=(arr[3]*1200+itime);
					arr[3]=0;
				} else {
					arr[3]+=1;
				}
				l.set(it-1, arr);;
			}
			Collections.sort(l, new Sorter());
			for(int i = 0; i < l.size(); i++) {
				int[] ans = l.get(i);
				System.out.printf("%d %d %d",ans[0],ans[1],ans[2]);
				System.out.println();
			}
		}
	}
}
class Sorter implements Comparator<int[]> {
	public int compare(int[] a, int[] b) {
		if(b[1] != a[1]) return b[1] - a[1];
		if(a[2] != b[2]) return a[2] - b[2];
		return a[1] - b[1];
	}
}