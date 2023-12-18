import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, m, i, j, imax = 0;
		n = scan.nextInt();
		m = scan.nextInt();
		int[] game = new int[n + 1];
		int[] member = new int[m + 1];
		int[] memberf = new int[m + 1];
		int[] result = new int[n + 1];
		for(i = 0; i < n; i++){
			game[i] = scan.nextInt();
		}
		for(i = 0; i < m; i++){
			member[i] = scan.nextInt();
		}
		scan.close();
		for(i = 0; i < n; i++){
			for(j = 0; j < m; j++){
				if(memberf[j] == 0 && game[i] <= member[j]){
					result[i]++;
					memberf[j] = 1;
				}
			}
		}
		for(i = 0; i < n; i++){
			if(result[i] > result[imax]){
				imax = i;
			}
		}
		System.out.println(imax + 1);
	}
}