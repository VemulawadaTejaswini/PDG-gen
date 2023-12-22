import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import javax.swing.tree.TreeNode;
class Main{


	static final int MOD = 1000000007;

	static	ArrayList<TreeNode> tree;
	static HashSet<Integer> set;
	static int[] ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int k = sc.nextInt();
		int x = sc.nextInt();
		
		int left = x - (k-1);
		int right = x + (k-1);
		for(int i = left;i <= right;i++){
			System.out.print(i+" ");
		}
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




