import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
class Main{


	static final int MOD = 1000000007;

	static int MAX = 10000000;
	static	ArrayList<TreeNode> tree;
	static HashSet<Integer> set;
	static long ans;

	static HashSet<Integer> memo;
	static HashMap<Integer, TreeNode> map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String ss = sc.next();
		int ans = 0;
		for(int i = 0;i < ss.length()/2;i++){
			if(ss.charAt(i) != ss.charAt(ss.length()-1-i)){
				ans++;
			}
		}
		System.out.println(ans);



	}
















static long fac[] = new long[MAX];
static long finv[] = new long[MAX];
static long inv[] = new long[MAX];



//テーブルの作成
static void COMinit() {
	fac[0] = fac[1] = 1;
	finv[0] = finv[1] = 1;
	inv[1] = 1;
	for (int i = 2; i < MAX; i++){
		fac[i] = fac[i - 1] * i % MOD;
		inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
		finv[i] = finv[i - 1] * inv[i] % MOD;
	}
}

// 二項係数計算
static	long COM(int n, int k){
	if (n < k) return 0;
	if (n < 0 || k < 0) return 0;
	return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
}








static int upperbond(int k,ArrayList<Integer> data){		//k以下で最大の値をdataの中から探し、返す二分探索
	if(data == null){
		return -1;
	}
	int max = data.size();
	int min = -1;
	while(max-min > 1){
		int mid = (max+min)/2;
		if(data.get(mid) <= k){
			min = mid;
		}else{
			max = mid;
		}
	}


	//		if(min != -1){
	//			min = data.get(min);
	//		}

	//		System.out.println(max);
	return min;					//indexを返している
}

static int lowerbond(int k,ArrayList<Integer> data){		//k以上で最小の値をdataの中から探し、返す二分探索
	if(data == null){
		return -1;
	}
	//		System.out.println("lo");
	//		System.out.println("lo");
	int max = data.size();
	int min = -1;

	while(max-min > 1){
		int mid = (max+min)/2;
		if(data.get(mid) >= k){
			max = mid;
		}else{
			min = mid;
		}
	}

	return max;			//indexを返している
}



static int gcd(int a,int b){				//最大公約数を返す
	if(b == 0){
		return a;
	}else{
		return gcd(b, a%b);
	}
}
static long gcd(long a,long b){
	if(b == 0){
		return a;
	}else{
		return gcd(b, a%b);
	}
}



static long lcm (long a, long b) {
	long g = gcd(a,b);
	return a/g*b;
}
}



class TreeNode{
	int value;
	ArrayList<TreeNode> children;
	boolean root;
	boolean fchild;

	public TreeNode(int value,ArrayList<TreeNode> children,boolean root) {
		this.value = value;
		this.children = children;
		this.root = root;
	}


}

class Pair implements Comparable{
	int from;
	int end;
	public Pair(int from,int end) {
		this.from = from;
		this.end = end;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return  from - otherpair.from;
	}








}




