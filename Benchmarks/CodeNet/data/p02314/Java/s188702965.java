import java.util.Scanner;
public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int S [] = new int [m+1]; //S[n] are possible coin choices
        for (int i=1; i<m+1; i++) {
        	S[i] = sc.nextInt();
        }
		int count [] = new int [n+1]; //optimized count
		for (int i=1; i<=n; i++){ //iterate until the goal value n
			int min = 50000;
			for(int j=1; j<=m; j++) { //for every "goal value" i, minimize the coin number
                if(i-S[j] >= 0)
                	if (count[i-S[j]] < min) min = count[i-S[j]];
            }
            count[i] = min + 1;
        }
		System.out.println(count[n]);
	}
}