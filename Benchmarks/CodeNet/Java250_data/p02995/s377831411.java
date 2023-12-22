import java.util.ArrayList;
import java.util.Scanner;
class Main{


	static char[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力



		long A = sc.nextLong();
		long B = sc.nextLong();
		int C = sc.nextInt();
		int D = sc.nextInt();

		long key = lcm(C, D);
//		System.out.println(key);
		long ans = 0;
		
		ans += (B/C - A/C) + (B/D - A/D) - (B/key - A/key);
//		System.out.println((B/C - A/C)+1);
//
//		System.out.println((B/D - A/D) + 1);
//		System.out.println((B/key - A/key)+1);


		if(A%C == 0){
			ans++;
		}
		if(A%D == 0){
			ans++;
		}
		if(A%key == 0){
			ans--;
		}
		System.out.println(B-A+1-ans);
		
		

	}

	static int rsearch(int y,int x){

		int count = 0;
		while(x < map[0].length && map[y][x] != '#'){
			count++;
			x++;
		}
		return count;	

	}

	static int csearch(int y,int x){

		int count = 0;
		while(y < map.length && map[y][x] != '#'){
			count++;
			y++;
		}
		return count;	
	}


	static boolean checkswitch(int bit,int[] k,ArrayList<ArrayList<Integer>> list,int[] p,int m){

		//		System.out.println("bit " + bit);

		for(int i = 0;i < m;i++){

			ArrayList<Integer> sub = list.get(i);
			int onnum = 0;						//onの数
			for(int j = 0;j < sub.size();j++){
				//				System.out.println("sub "+ sub.get(j));
				if((bit & (1 << sub.get(j))) != 0){				//目的のスイッチがついているか
					onnum++;
					//					System.out.println("on  ");
				}

			}
			if(onnum % 2 != p[i]){				//一個でも電球がつかなかったらout
				return false;
			}

		}


		return true;

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
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return  otherpair.end - end;
	}
}


