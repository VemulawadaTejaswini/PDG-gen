import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String args[]) throws IOException {
		int Ans = 0;
		int ans = 0;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1 = new String(in.readLine());

		int N = Integer.parseInt(s1);

		String s2 = new String(in.readLine());
		String[] a = s2.split(" +");

		List<Integer> A = new ArrayList<Integer>();

		A.add(0);
		for(int i = 0;i < N;i++) {
			if( i == 0 || A.get(A.size() - 1) != Integer.parseInt(a[i])) {
				A.add(Integer.parseInt(a[i]));
			}
		}
		A.add(0);

		List<St> li = new ArrayList<St>();

		for(int i = 0;i < A.size() ;i++) {
			li.add(new Main().new St(A.get(i),i));
		}

		li.sort((e1,e2)-> e1.getNum() - e2.getNum()	);

		//初期状態での島の数の確認
		//マイナスからプラスへの境目を見る
		for (int j = 0; j < A.size() - 1 ; j++) {
			if (A.get(j) == 0 && A.get(j + 1) > 0) {
				ans++;
			}
		}
		Ans = ans;

		int countNum = 0;
		int incNum = 0;
		int decNum = 0;
		//System.out.println("初期島数 = " + Ans);
		
		//島の最大数を確認する
		//見る数値がリストの数値の中で最大値になった場合、終了する。
		for (int i = 0; li.get(i).getNum() != li.get(li.size() - 1).getNum();i++) {
			St st = li.get(i);
			St nextst = li.get(i + 1);

			//初期状態は確認しているのでスキップ
			if (st.getNum() <= 0 ) {
				continue;
			}

			countNum++;

			//沈む陸地に対しその左右の陸地をみて
			//ansを操作する。
			int nl_num = A.get(st.getIndex() - 1) ;
			int nr_num = A.get(st.getIndex() + 1) ;


			if (nl_num - st.getNum() > 0 && nr_num - st.getNum() > 0) {
				ans++;
				incNum++;
				//System.out.print("[in]:");
			}
			if (nl_num - st.getNum() <= 0 && nr_num - st.getNum() <= 0) {
				ans--;
				decNum++;
				//System.out.print("[de]:");
			}
		

			//System.out.println("getNum = " + String.format("%2d",st.getNum()) +",i = " + String.format("%4d",i) + ",index = " + String.format("%4d",st.getIndex()) + ",left = " + String.format("%2d",(rnum + st.getNum())) + ",right = " + String.format("%2d",(nnum + st.getNum())) + ",ans = " + String.format("%3d",ans));

			//海面の高さが変化するタイミングで
			//ansの判定を行う。
			if (st.getNum() != nextst.getNum() ) {
				if (ans > Ans) {
					Ans = ans;
				}
				//System.out.println("浸水 = " +  String.format("%2d",st.getNum()) + ",対象 = " + String.format("%4d",countNum) + ",inc = " + String.format("%4d",incNum) + ",dec = " + String.format("%4d",decNum) + ",ans = " + String.format("%4d",ans) + ",Ans = " + String.format("%4d",Ans));
				countNum = 0;
			}
			//if(i > 1000) {
			//	break;
			//}
		}

		System.out.println(Ans);
	}
	public class St{
		private int num;
		private int index;

		public St(int num , int index) {
			this.num = num;
			this.index = index;
		}

		public int getNum() {
			return num;
		}

		public int getIndex() {
			return index;
		}
	}

}
