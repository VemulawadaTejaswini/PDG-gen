import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] team = new int[n];
		int[] result = new int[n];
		int ateam = 0, bteam = 0, apoint = 0, bpoint = 0, i = 0, j = 0;
		for(i = 0; i < n * (n - 1) / 2; i++){
			ateam = scan.nextInt();
			bteam = scan.nextInt();
			apoint = scan.nextInt();
			bpoint = scan.nextInt();
			if(apoint > bpoint){
				team[ateam - 1] += 3;
			} else if(bpoint > apoint){
				team[bteam - 1] += 3;
			} else if(apoint == bpoint){
				team[ateam - 1]++;
				team[bteam - 1]++;
			}
		}
		scan.close();
		for(i = 0; i < n; i++){
			result[i] = 1;
			for(j = 0; j < n; j++){
				if(team[i] < team[j]){
					result[i]++;
				}
			}
		}
		for(i = 0; i < n; i++){
			System.out.println(result[i]);
		}
	}
}