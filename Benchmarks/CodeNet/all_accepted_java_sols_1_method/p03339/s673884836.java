import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String str = sc.next();
		int array[] = new int[N];
		Arrays.fill(array, 0);
		for(int i = 0; i < N; i++) {
			if(i == 0) {
				for(int j = 1; j < N; j++) {
					if(str.substring(j, j + 1).equals("E")) {
						array[0]++;
					}
				}
			} else {
				if(str.substring(i - 1, i).equals("W")) {
					array[i] = array[i - 1] + 1;
				} else {
					array[i] = array[i - 1];
				}
				if(str.substring(i, i + 1).equals("E")) {
					array[i]--;
				}
			}
		}
		Arrays.sort(array);
		System.out.println(array[0]);
	}
}
