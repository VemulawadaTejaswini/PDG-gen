import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main mainObj = new Main();
		mainObj.solve();
	}
	
	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] monsterArr = new int[n+1];
		int[] heroArr = new int[n];
		
		for(int i = 0; i < n+1;i++) {
			monsterArr[i] = sc.nextInt();
		}
		for(int i = 0; i < n;i++) {
			heroArr[i] = sc.nextInt();
		}
		
		sc.close();
		
		long ans = 0;
		for(int i = 0; i < n; i++) {
			int numOfMonster = monsterArr[i];
			int capableBeat = heroArr[i];
			if(numOfMonster >= capableBeat) {
				ans += capableBeat;
			}else {
				capableBeat -= numOfMonster;
				ans += numOfMonster;
				int nextMonster = monsterArr[i+1];
				if(nextMonster >= capableBeat) {
					ans += capableBeat;
					monsterArr[i + 1] -= capableBeat;
				}else {
					ans += nextMonster;
					monsterArr[i + 1] = 0;
				}
			}
		}
		
		System.out.println(ans);
	}
}
