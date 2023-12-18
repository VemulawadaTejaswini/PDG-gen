
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author kumar1
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		InputStream in = System.in;
		Scanner scanner = new Scanner(in);
		LinkedList<String> ans = new LinkedList<String>();
		// DPでとく
		int[] map = new int[1000001];
		for(int i=0; i < map.length; i++)
			map[i] = 1000001;
		int[] mapodd = new int[map.length];
		for(int i=0; i < mapodd.length; i++)
			mapodd[i] = 1000001;
		for(int n=0; ; n++) {
			int pollock = n * (n + 1) * (n + 2) / 6;
			if(pollock > 1000000)
				break;
			map[pollock] = 1;
			for(int i=0; i < 1000001; i++) {
				if(i - pollock < 0)
					continue;
				map[i] = Math.min(map[i], map[i - pollock] + 1);	
			}
			if(pollock % 2 == 1) {
				mapodd[pollock] = 1;
				for(int i=0; i < 1000001; i++) {
					if(i - pollock < 0)
						continue;
					mapodd[i] = Math.min(mapodd[i], mapodd[i - pollock] + 1);	
				}
			}
		}
		
		while (true) {
			int x = scanner.nextInt();
			if (x == 0)
				break;
			ans.add(map[x] + " " + mapodd[x]);
		}
		scanner.close();
		for (String a : ans) {
			System.out.println(a);
		}
	}


}