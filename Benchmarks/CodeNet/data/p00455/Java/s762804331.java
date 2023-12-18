import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[][] sec = new int[3][2];
		int[] time = new int[3];
		
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 2; j++){
			sec[i][j] += sc.nextInt() * 3600;
			sec[i][j] += sc.nextInt() * 60;
			sec[i][j] += sc.nextInt();
		}
		for(int i = 0; i < 3; i++){
			time[i] = sec[i][1] - sec[i][0];
		}
		for(int i = 0; i < 3; i++){
				System.out.print(time[i] / 3600 + " ");
				System.out.print(time[i] % 3600 / 60 + " ");
				System.out.println(time[i] % 3600 % 60);
		}
		sc.close();
	}
}