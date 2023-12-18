import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int sz = Integer.parseInt(sc.nextLine());
			String[] vals = sc.nextLine().split("\\s+");

			int[] arr = new int[vals.length];
			for (int i=0; i<vals.length; i++) arr[i] = Integer.parseInt(vals[i]);

			int res = 0;
			int cur = 1;
			for (int x : arr) {
				if (x != cur) {
					res ++;
				} else {
					cur ++;
				}
			}

			if (res == arr.length) res = -1;
			
			System.out.println(res);
		}
	}

}
