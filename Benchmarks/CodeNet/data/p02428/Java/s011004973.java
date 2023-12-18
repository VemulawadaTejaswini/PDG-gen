import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			//入力と配列準備
			int n = sc.nextInt();
			int max = (int)Math.pow(2,n) - 1;
			int tLen = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer> ();
			for (int i = 0; i<tLen; i++) list.add(sc.nextInt());
			ArrayList<Integer> ans = new ArrayList<Integer>();
			//--------------------------------------------------------
			if (tLen == 0) System.out.println("0:");
			for (int i = 1; i<=max; i++) {
				ans.clear(); //初期化
				String binary = Integer.toBinaryString(i);
				for (int j=0; j<binary.length(); j++) {
					char c =  binary.charAt(binary.length()-j-1);
					if (c == '1') {
						ans.add(j);  //部分集合をキープ
					}
				}
				if (ans.containsAll(list)) {
					System.out.print(i+":");
					for (int j : ans) System.out.print(" " + j);
					System.out.print('\n');
				}
			}
		}
	}
}
