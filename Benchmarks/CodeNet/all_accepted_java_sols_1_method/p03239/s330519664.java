import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int cost = 1001;
		Scanner scanner = new Scanner(System.in);
		String NT[] = scanner.nextLine().split(" ",0);
		int N = Integer.parseInt(NT[0]);
		int T = Integer.parseInt(NT[1]);

		for(int i = 0; i < N; i++){
			scanner.hasNextLine();
			String nt[] = scanner.nextLine().split(" ",0);
			int n = Integer.parseInt(nt[0]);
			int t = Integer.parseInt(nt[1]);
			if(t <= T & n <= cost){
				cost = n;
			}
		}
		if(cost == 1001){
			System.out.print("TLE");
		}else{
			System.out.print(cost);
		}
	}

}
