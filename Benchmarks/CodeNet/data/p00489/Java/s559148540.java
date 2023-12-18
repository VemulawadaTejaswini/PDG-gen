public class Main {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int n = in.nextInt();
		int[] team = new int[n];
		int[] tmp = new int[4];
		for (int j=0; j<(n*(n-1)/2); j++) {
			for (int i=0; i<4; i++) {
				tmp[i] = in.nextInt();
			}
			if(tmp[2] < tmp[3])
				team[tmp[1]-1] += 3;
			if(tmp[2] == tmp[3]) {
				team[tmp[0]-1] += 1;
				team[tmp[1]-1] += 1;
			}
			if(tmp[2] > tmp[3])
				team[tmp[0]-1] += 3;
		}
		for (int i=0; i<n; i++) {
			int cnt = 1;
			for (int j=0; j<n; j++) {
				if(team[i] < team[j]) cnt++;
			}
			System.out.println(cnt);
		}
	}
}