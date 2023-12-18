import java.util.Scanner;
class Main{
	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		int tate = sc.nextInt();
		int yoko = sc.nextInt();
		int[][] map = new int[tate][yoko];
		int sum = 0;
		for(int i = 0; i < tate; i++){
			for(int j = 0; j < yoko; j++){
				map[i][j] = sc.nextInt();
			}
		}
		int[] b = new int[yoko];
		for(int i = 0; i < yoko; i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < tate; i++){
			sum = 0;
			for(int j = 0; j < yoko; j++){
				sum += map[i][j];
			}
			System.out.println(sum + b[i]);
		}

	}
}