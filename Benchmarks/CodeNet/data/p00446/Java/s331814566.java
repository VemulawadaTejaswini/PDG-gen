//Volume5-0523
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

	private static ArrayList<Integer> taro   = new ArrayList<Integer>(),
                                      hanako = new ArrayList<Integer>();

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		while(true){
			int       n      = sc.nextInt();
			if(n==0){break;}
			int       l      = n * 2 + 1;
			boolean[] flg    = new boolean[l];
			Arrays.fill(flg, true);

			taro.clear(); hanako.clear();

			int t;
			for(int i=0;i<n;i++){
				t = sc.nextInt();
				taro.add(t);
				flg[t] = false;
			}
			for(int i=1;i<l;i++){
				if(flg[i]){
					hanako.add(i);
				}
			}
			Collections.sort(taro);
			int board = taro.remove(0);
			ArrayList<Integer> turn = hanako;
			boolean find = false;
			while(true){
				find = false;
				for(int i=0;i<turn.size();i++){
					if(board<turn.get(i)){
						board=turn.remove(i);
						find = true;
						break;
					}
				}
				if(!find)         {board = 0    ;}
				if(turn.size()==0){break        ;}
				if(turn==hanako)  {turn = taro  ;}
				else              {turn = hanako;}
			}
			System.out.printf("%d\n%d\n",hanako.size(),taro.size());
		}
	}
}