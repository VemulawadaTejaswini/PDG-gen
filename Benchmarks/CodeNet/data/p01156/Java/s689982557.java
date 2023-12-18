import java.util.*;

public class Main{
	static String[] hand = {
		"Rock",
		"Gun",
		"Lightning",
		"Devil",
		"Dragon",
		"Water",
		"Air",
		"Paper",
		"Sponge",
		"Wolf",
		"Tree",
		"Human",
		"Snake",
		"Scissors",
		"Fire",
	};

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			int[] h = new int[n];
			for(int i=0;i<n;i++){
				h[i] = searchTable(sc.next());
			}

			int ans = -1;
			for(int i=0;i<n;i++){
				int count = 0;
				int lose = 0;
				for(int j=0;j<n;j++){
					if(i == j) continue;
					if(h[i]-7<0 && ((h[i]+15-7)%15<=h[j] || h[j]<h[i]) ||
						 h[i]-7<=h[j] && h[j]<h[i]){
						count++;
					} else if(h[i] != h[j]) {
						lose++;
					}
				}
				if(count > 0 && lose == 0){
					ans = h[i];
					break;
				}
			}

			System.out.println(ans==-1 ? "Draw" : hand[ans]);
		}
	}

	static int searchTable(String s){
		for(int i=0;i<15;i++){
			if(hand[i].equals(s)) return i;
		}
		return -1;
	}
}