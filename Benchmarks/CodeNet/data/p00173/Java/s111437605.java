import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] classroom = new String[9];
		int[][] sum = new int[2][9];
		
		for(int i = 0; i < 9; i++){
			classroom[i] = sc.next();
			sum[0][i] = sc.nextInt();
			sum[1][i] = sc.nextInt();
		}
		for(int i = 0; i < 9; i++){
			System.out.println(classroom[i] + " " + (sum[0][i] + sum[1][i]) + " " + (sum[0][i] * 200 +  sum[1][i] * 300));
		}
		sc.close();
	}
}