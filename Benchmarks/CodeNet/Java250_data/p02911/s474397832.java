import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,k,q;
		n = sc.nextInt();
		k = sc.nextInt();
		q = sc.nextInt();
		Map<Integer,Integer> mp = new HashMap<>();
		for(int i = 0;i < n; ++i){
			mp.put(i,k);
		}
		for(int i = 0;i < q; ++i){
			int x = sc.nextInt();
			--x;
			mp.put(x,mp.get(x) + 1);
		}
		for(int i = 0;i < n; ++i){
			int cur = mp.get(i);
			if(cur - q > 0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}