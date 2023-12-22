import java.util.ArrayList;
import java.util.Scanner;
class Main{


	static char[][] map;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力



		int N = sc.nextInt();
		int L = sc.nextInt();

		int[] data = new int[N];
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0;i < N;i++){
			data[i] = L + i ;
			sum += data[i];
			
		}
		int ans = 0;
		for(int i = 0;i < N;i++){
			if(Math.abs(sum-(sum-data[i])) < min){
				min = Math.abs(sum-(sum-data[i]));
				ans = sum-data[i];
			}
		}
		
		
		System.out.print(ans) ;
		
		
		
		

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


