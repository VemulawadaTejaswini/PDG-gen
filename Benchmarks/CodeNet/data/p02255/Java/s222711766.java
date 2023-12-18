import java.util.Scanner;


public class Main{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int[] values = new int[a];
		String sr[] = new String[a];
		String str = "";

		for(int i=0 ; i<sr.length ; i++) {
			values[i] = s.nextInt();
		}
		for(int j=0 ; j<values.length ; j++) {
			System.out.print(values[j]);
		}
		System.out.println();
		solve(values);
	}

	public static void solve(int[] values) {
		for(int i=1 ; i<values.length ; i++) {
			int targetV = values[i];
			int movableIndex = i - 1;
			while(movableIndex >= 0 && values[movableIndex] > targetV) {
				values[movableIndex + 1] = values[movableIndex];
				movableIndex--;
			}
			values[movableIndex + 1] = targetV;
			for(int j=0 ; j<values.length ; j++) {
				System.out.print(values[j]);
			}
			System.out.println();
		}
	}
}