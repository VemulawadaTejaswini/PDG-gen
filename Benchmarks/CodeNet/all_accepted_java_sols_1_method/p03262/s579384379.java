import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の標準入力
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] xCityCoordinate = new int[n];
		int[] xDifference = new int[n];
		// 整数nの数だけ標準入力
		for(int i = 0; i < n; i++) {
			xCityCoordinate[i] = sc.nextInt();
			xDifference[i] = Math.abs(x - xCityCoordinate[i]);
		}
		Arrays.sort(xCityCoordinate);
		Arrays.sort(xDifference);
		for(int i = 0; i < n; i++) {
			if(xDifference[i] % xDifference[0] != 0) {
				while(true) {
					xDifference[0] = xDifference[0] - 1;
					if(xDifference[i] % xDifference[0] == 0) {
						break;
					}
				}
			}
		}
		System.out.println(xDifference[0]);
		sc.close();
	}
}