import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (true) {
			int chukan = sc.nextInt(); int kimatsu = sc.nextInt(); int saishi = sc.nextInt();
			if (chukan==-1 && kimatsu==-1 && saishi==-1) return;
			
			String ans = "";
			int sum = chukan + kimatsu;
			if (chukan==-1 || kimatsu==-1) ans = "F";
			else if (sum >= 80) ans = "A";
			else if (65<=sum && sum<80) ans = "B";
			else if (50<=sum && sum<65) ans = "C";
			else if (30<=sum && sum<50) {
				if (50 <= saishi) ans = "C";
				else ans = "D";
			}
			else ans = "F";
			
			System.out.println(ans);
		}
		
	}
}
