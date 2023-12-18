import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[][] peeledTile = new int[k][2];
		int center = n / 2 + 1;
		for(int i = 0; i < k; i++){

			peeledTile[i][0] = s.nextInt();
			peeledTile[i][1] = s.nextInt();

		}

		for(int i = 0; i < k; i++){

			if(peeledTile[i][0] > n / 2){
				peeledTile[i][0] = n - peeledTile[i][0] + 1;
			}
			if(peeledTile[i][1] > n / 2){
				peeledTile[i][1] = n - peeledTile[i][1] + 1;
			}

			if(n % 2 == 1 && peeledTile[i][0] == center && peeledTile[i][1] == center){
				print(center % 3);
			}else if(peeledTile[i][0] % 3 == peeledTile[i][1] % 3 || peeledTile[i][0] < peeledTile[i][1]){
				print(peeledTile[i][0] % 3);
			}else{
				print(peeledTile[i][1] % 3);
			}

		}

		s.close();

	}

	public static void print(int ans){
		if(ans == 0)
			ans = 3;
		System.out.println(ans);
	}
}