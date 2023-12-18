import java.util.*;

public class Main {
	public static void main(String[] args) {
		int[] values = {111,222,333,444,555,666,777,888,999};
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < values.length; i++) {
			if(values[i] >= N) {
				System.out.println(values[i]);
				return;
			}
		}
	}
}
