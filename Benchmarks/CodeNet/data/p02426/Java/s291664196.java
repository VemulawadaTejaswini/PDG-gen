import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {

		//初期化
		int n = scan.nextInt();
		boolean[] flag = new boolean[64];
		ArrayList<ArrayList<Integer>> bitmask = new ArrayList<>();

		for(int i=0; i<n; i++) {
			int cm = scan.nextInt();
			ArrayList<Integer> list = new ArrayList<>();

			for(int j=0; j<cm; j++) {
				list.add(scan.nextInt());
			}
			bitmask.add(list);	//WARNING
		}
		
		
		//処理
		//flagの操作をlistの範囲で切り替える
		int m = scan.nextInt();							
		
		for(int i=0; i<m; i++) {

			int query = scan.nextInt();

			switch(query) {

			case 0:	//test
				int cmd0 = scan.nextInt();
				System.out.println(flag[cmd0] ? 1 : 0);
				break;

			case 1: //set
				int cmd1 = scan.nextInt();
				for(int j=0; j<bitmask.get(cmd1).size(); j++) flag[bitmask.get(cmd1).get(j)] = true;
				break;

			case 2: //clear
				int cmd2 = scan.nextInt();
				for(int j=0; j<bitmask.get(cmd2).size(); j++) flag[bitmask.get(cmd2).get(j)] = false;
				break;
				
			case 3: //flip
				int cmd3 = scan.nextInt();
				for(int j=0; j<bitmask.get(cmd3).size(); j++) {
					if(flag[bitmask.get(cmd3).get(j)]) {flag[bitmask.get(cmd3).get(j)] = false;	//WARNING
					}else {
						flag[bitmask.get(cmd3).get(j)] = true;
					}
				}
				break;

			case 4: //all
				int cmd4 = scan.nextInt();
				int count = 0;
				for(int j=0; j<bitmask.get(cmd4).size(); j++) {
					if(flag[bitmask.get(cmd4).get(j)]) count++;
				}
				if(count == bitmask.get(cmd4).size()) System.out.println(1);
				else System.out.println(0);
				break;

			case 5: //any
				int cmd5 = scan.nextInt();
				int count2 = 0;
				for(int j=0; j<bitmask.get(cmd5).size(); j++) {
					if(flag[bitmask.get(cmd5).get(j)]) count2++;
				}
				if(count2 > 0)System.out.println(1);
				else System.out.println(0);
				break;

			case 6:	//none
				int cmd6 = scan.nextInt();
				int count3 = 0;
				for(int j=0; j<bitmask.get(cmd6).size(); j++) {
					if(flag[bitmask.get(cmd6).get(j)]) count3++;
				}
				if(count3 == 0)System.out.println(1);
				else System.out.println(0);
				break;

			case 7:	//count
				int cmd7 = scan.nextInt();
				int sum = 0;
				for(int j=0; j<bitmask.get(cmd7).size(); j++) {
					if(flag[bitmask.get(cmd7).get(j)]) sum++;
				}
				System.out.println(sum);
				break;

			case 8:	//var
				int cmd8 = scan.nextInt();
				long sum2 = 0;
				for(int j=0; j<bitmask.get(cmd8).size(); j++) {
					long pow = 1;

					if(flag[bitmask.get(cmd8).get(j)]) {
						for(int k=0; k<bitmask.get(cmd8).get(j); k++) pow *= 2;
						sum2 += pow;
					}
				}
				System.out.println(Long.toUnsignedString(sum2));
				break;
			}
		}
	}
}
