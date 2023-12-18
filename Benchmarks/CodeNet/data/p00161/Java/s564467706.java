import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		while(n != 0){
			int teamNum[] = new int[n];
			int timeMT = 0;
			int timeST = 0;
			int totalS[] = new int[n];

			for(int i = 0 ; i < n ; i++){
				timeMT = 0;
				timeST = 0;
				teamNum[i] = scan.nextInt();
				for(int j = 0 ; j < 4 ; j++){
					int m = scan.nextInt();
					int s = scan.nextInt();
					timeMT += m;
					timeST += s;
				}
				totalS[i] = timeMT * 60 + timeST;
			}
			for(int i = 0 ; i < n ; i++){
				for(int j = 0 ; j < n-1-i ; j++){
					if(totalS[j] > totalS[j+1]){
						int t = totalS[j];
						totalS[j] = totalS[j+1];
						totalS[j+1] = t;
						int T = teamNum[j];
						teamNum[j] = teamNum[j+1];
						teamNum[j+1] = T;
					}
				}
			}

			System.out.println(teamNum[0]);
			System.out.println(teamNum[1]);
			System.out.println(teamNum[n-2]);
			n = scan.nextInt();
		}
	}
}