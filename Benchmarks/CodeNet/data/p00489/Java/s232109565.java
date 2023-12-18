import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int team = sc.nextInt();
		int Maxgame = team * (team - 1) / 2;
		int[] indexA = new int[Maxgame];
		int[] indexB = new int[Maxgame];
		int[] pointA = new int[Maxgame];
		int[] pointB = new int[Maxgame];
		for(int i = 0; i < Maxgame; i++){
			indexA[i] = sc.nextInt() - 1;
			indexB[i] = sc.nextInt() - 1;
			pointA[i] = sc.nextInt();
			pointB[i] = sc.nextInt();
		}
		String solve = solve(team,indexA,indexB,pointA,pointB);
		System.out.println(solve + "\n");
	}
	
	private static String solve(int team,int[] indexA,int[] indexB,int[] pointA,int[] pointB){
		int[] winpoint = new int[team];
		for(int i = 0;i < indexA.length;i++){
			if(pointA[i] > pointB[i]){
				winpoint[indexA[i]] += 3;
			} else if(pointA[i] < pointB[i]){
				winpoint[indexB[i]] += 3;
			} else {
				winpoint[indexA[i]]++;
				winpoint[indexB[i]]++;
			}
		}
		int[] rank = new int[team];
		for(int i = 0; i < winpoint.length; i++){
			for(int j = 0; j < winpoint.length; j++){
				if(winpoint[i] < winpoint[j])rank[i]++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < rank.length; i++){
			sb.append((rank[i] + 1) + "\n");
		}
		return sb.toString().trim();
	}
}