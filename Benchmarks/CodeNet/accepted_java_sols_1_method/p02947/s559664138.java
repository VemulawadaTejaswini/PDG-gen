import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[]save = new String[N];
		long sum = 0;
		HashMap<String, Integer> countView = new HashMap<String, Integer>();
		for(int i = 0; i < N; i++) {
			String tmp = sc.next();
			char tmpArray[] = tmp.toCharArray();
			Arrays.sort(tmpArray);
			String afterSort = new String(tmpArray);
			//HashMapを使う
			if(countView.containsKey(afterSort)) {
				int oldValue = countView.get(afterSort);
				int newValue = oldValue + 1;
				countView.put(afterSort, newValue);
				sum += newValue;
			}else {
				countView.put(afterSort, 0);
			}
		}
		System.out.println(sum);
	}

}