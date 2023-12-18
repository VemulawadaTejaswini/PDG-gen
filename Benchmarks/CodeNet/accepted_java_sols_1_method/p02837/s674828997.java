import java.util.*;
public class Main {
	static int N, A[];
	static List X;
	static boolean mujun;
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];

		X = new ArrayList<ArrayList<int[]>>();
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
			List tmp = new ArrayList<int[]>();
			for(int j=0;j<A[i];j++) {
				int x = sc.nextInt() - 1; //人だけ０スタートにする
				int y = sc.nextInt();
				int t[] = {x, y};
				tmp.add(t);
			}	
			X.add(tmp);
		}
		sc.close();
		int ans = 0;
		for(int bit=0;bit<(1<<N);bit++) {
			//0bbitが全員のフラグを表す
			mujun = false;
			for(int i=0;i<N;i++) {
				if(((bit>>i)&1)==1) {
					List tmp = (List)X.get(i);
					for(int j=0;j<A[i];j++) {
						int judge[] = (int[])tmp.get(j); 
						int toPerson = judge[0];
						int toHonest = judge[1];
						if(((bit>>toPerson)&1)!=toHonest) {
							mujun = true;
							break;
						}
					}
				}
			}
			if(mujun)continue;
			ans = Math.max(ans,Integer.bitCount(bit));
		}
		
		
		System.out.println(ans);
	}
	
	
}