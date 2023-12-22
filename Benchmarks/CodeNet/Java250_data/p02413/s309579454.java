import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int gyou = sc.nextInt();
		int retu = sc.nextInt();
		int gyouSum = 0;
		int retuSum = 0;
		int sum = 0;
		int map[][] = new int[gyou][retu];

		for(int i = 0; i < gyou; i++){
			for(int j = 0; j < retu; j++){
				map[i][j] = sc.nextInt();
			}
		}

		for(int i = 0; i < gyou; i++){
			gyouSum = 0;
			for(int j = 0; j < retu; j++){
				System.out.print(map[i][j] + " ");
				gyouSum += map[i][j];
			}
			System.out.println(gyouSum);
		}
		for(int j = 0; j < retu; j++){
			retuSum = 0;
			for(int i = 0; i < gyou; i++){
				retuSum += map[i][j];
			}
			System.out.print(retuSum + " ");
			sum += retuSum;
		}
		System.out.println(sum);


	}
}