import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ab;
		int[] road = new int[n+1];
		for(int i = 0;i<m*2;i++) {
			ab = sc.nextInt();
			road[ab-1] =road[ab-1]+1;
		}
		for(int i = 0;i < n;i++) {
			System.out.println(road[i]);
		}
	}

}

