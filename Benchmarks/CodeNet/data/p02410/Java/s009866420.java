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
		int[] b = new int[100];
		int n = 0;
		while(sc.hasNext()){
			b[n] = sc.nextInt();
			if(b[n] == 0) break;
			n++;
		}
		for(int i = 0; i < n; i++){
			sum = 0;
			for(int j = 0; j < yoko; j++){
				sum += map[i][j];
			}
			System.out.println(sum + b[i]);
		}

	}
}