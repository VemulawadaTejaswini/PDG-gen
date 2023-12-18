import java.util.*;


public class Main {
	//union-find treeの生成
	static int parent[] = new int[100001];//親ノード,indexの0番目は考えない
	static int rank[] = new int[100001];//木の深さ
	//n要素で初期化

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		parent[1] = 1;
		rank[1] = 1;
		for(int i=2;i<=N;i++){
			parent[i] = sc.nextInt();
			rank[i] = rank[parent[i]]+1;
		}
		int[] ini_parent = parent.clone();
		int[] ini_rank = rank.clone();
		int ans=0;
		List<Integer> mark = new ArrayList<Integer>();
		mark.add(1);
		for(int mm =0;mm<Q;mm++){
			String operation = sc.next();
			if(operation.equals("Q")){
				parent = ini_parent.clone();
				rank = ini_rank.clone();
				for(int i=1;i<=N;i++){
					if(mark.contains(i)){
						parent[i]=i;
					}else{
						unite(i,parent[i]);
					}
				}
				ans += find(sc.nextInt());
			}else{
				//operationがMのとき
				mark.add(sc.nextInt());
			}
		}
		System.out.println(ans);
	}
	static void init(int n){
		for(int i=0;i<n;i++){
			parent[i] = i;
			rank[i] = 0;
		}
	}

	//木の根を求める
	static int find(int x){
		if(parent[x] ==x){
			return  x;
		}else{
			return parent[x] = find(parent[x]);
		}
	}

	//xとyの属する属性の併合
	static void unite(int x, int y){
		x = find(x);//xの親ノードが属性だから
		y = find(y);
		if(x==y){
			//OK
		}else{
			if(rank[x]<rank[y]){
				parent[x] = y;
			}else{
				parent[y] = x;
				if(rank[x]==rank[y]){
					rank[x]++;
				}
			}
		}
	}

	//xとyが同じ属性に属するかどうか
	static boolean isSame(int x,int y){
		return find(x)==find(y);
	}
}