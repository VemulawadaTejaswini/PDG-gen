import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[100];
		for(int i = 1; i <= n*(n-1)/2; i++){
			int team1 = in.nextInt();
			int team2 = in.nextInt();
			int point1 = in.nextInt();
			int point2 = in.nextInt();
			if(point1 > point2){
				a[team1] += 3;
				continue;
			}else if(point1 < point2){
				a[team2] += 3;
				continue;
			}else if(point1 == point2){
				a[team1] += 1;
				a[team2] += 1;
			}
		}
		for(int j = 1; j <= n; j++){
			int an = n;
			for(int k = 1; k <= n; k++){
				if(j == k){
					continue;
				}else if(a[j] >= a[k]){
					an--;
				}
			}
			System.out.println(an);
		}
	}

}