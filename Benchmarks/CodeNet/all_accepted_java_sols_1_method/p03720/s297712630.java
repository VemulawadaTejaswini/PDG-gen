import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] roadInfo = new int[n+1];
		for(int i = 0;i < m;i++) {
			roadInfo[sc.nextInt()]++;
			roadInfo[sc.nextInt()]++;
		}
		for(int i =1;i <=n;i++) {
			System.out.println(roadInfo[i]);
		}

	}

}