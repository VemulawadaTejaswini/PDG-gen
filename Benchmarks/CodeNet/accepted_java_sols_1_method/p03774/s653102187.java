import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static boolean hiekou = false;
	public static int intHiekou = 0;

	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		List<String> lines1 = Arrays.asList(line1.split(" "));
		Integer N = Integer.parseInt(lines1.get(0));
		Integer M = Integer.parseInt(lines1.get(1));

		List<String> Ns = new ArrayList<String>();
		List<String> Ms = new ArrayList<String>();
		List<Integer> resList = new ArrayList<Integer>();

		for(int i = 0;i <N; i++) {
			Ns.add(sc.nextLine());
		}
		for(int j = 0;j < M; j++) {
			Ms.add(sc.nextLine());
		}

		List<String> ab = null;
		int a = 0;
		int b = 0;
		List<String> cd = null;
		int c = 0;
		int d = 0;
		int man = 0;
		int res = 0;
		int newman = 0;

		for(int j = 0;j < Ns.size(); j++) {
			ab = Arrays.asList(Ns.get(j).split(" "));
			a = Integer.parseInt(ab.get(0));
			b = Integer.parseInt(ab.get(1));
			man = 999999999;
			for(int k = 0;k < Ms.size(); k++) {
				cd = Arrays.asList(Ms.get(k).split(" "));
				c = Integer.parseInt(cd.get(0));
				d = Integer.parseInt(cd.get(1));
				newman = Math.abs(a - c) +  Math.abs(b - d);
				if(newman < man) {
					res = k+1;
					man = newman;
				}
			}
			resList.add(res);
		}

		for(int z = 0;z < resList.size(); z++) {
			System.out.println(resList.get(z));
		}

	}

}