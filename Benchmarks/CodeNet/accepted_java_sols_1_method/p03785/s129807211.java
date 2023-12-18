import java.util.*;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		Arrays.sort(t);
		
		int result = 0;
		int j = 1;
		int i = 0;
		while(i < n){
			if(j < n){
				if (t[j] <= t[i] + k && (j - i) < c ) {
					j++;
					continue;
				}
				result++;
				i = j;
				j = i + 1;
			}
			else {
				result++;
				break;
			}
		}
		System.out.println(result);
	}

}
