import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 3;
		boolean canDo = true;
		int[][] array = new int[n+1][d];
		for(int i=0; i < d;i++){
			array[0][i] = 0;
		}

		for(int i = 1; i < n+1; i++){
			int turn = Math.abs(array[i-1][0] - sc.nextInt());
			int dist = Math.abs(array[i-1][1] - sc.nextInt()) + Math.abs(array[i-1][2] - sc.nextInt());
			int x = turn -dist;
			if(x < 0 || x % 2 != 0){
				canDo = false;
				break;
			}
		}
		System.out.println(canDo ? "Yes" : "No");
	}
}