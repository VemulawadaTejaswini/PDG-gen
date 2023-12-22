import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>();

		int i;
		for(i = 0; i < n; i++) {
			map.put(scan.nextInt(), i + 1);
		}

		int cnt = 0;
		int len = map.size();
		for(int ans: map.values()) {
			cnt++;
			if(len > cnt)
				System.out.print(ans + " ");
			else
				System.out.println(ans);
		}

	}
}
