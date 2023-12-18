import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < h; i++) {
		    char[] arr = sc.next().toCharArray();
		    for (int j = 0; j < w; j++) {
		        if (arr[j] == '.') {
		            continue;
		        }
		        for (int x : list) {
		            int hh = x / w;
		            int ww = x % w;
		            max = Math.max(max, Math.abs(i - hh) + Math.abs(j - ww));
		        }
		        list.add(i * w + j);
		    }
		}
		System.out.println(max);
	}
}

