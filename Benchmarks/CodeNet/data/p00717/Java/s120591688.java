import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int data = sc.nextInt();
			if(data==0) break;
			int original_apexes = sc.nextInt();
			int[][] xy = new int[2][original_apexes*2];
			int[] translation = new int[2];
			translation[0] = sc.nextInt();
			translation[1] = sc.nextInt();

			for(int i=1; i<original_apexes; i++){
				xy[0][i*2] = sc.nextInt();
				xy[0][i*2+1] = sc.nextInt();
				xy[0][i*2] -= translation[0];
				xy[0][i*2+1] -= translation[1];
			}

			for(int i=0; i<original_apexes; i++){
				xy[1][(original_apexes-i-1)*2] = xy[0][i*2] - xy[0][(original_apexes-1)*2];
				xy[1][(original_apexes-i-1)*2+1] = xy[0][i*2+1] - xy[0][(original_apexes-1)*2+1];
			}

			int[][][] rotor =  new int[2][4][original_apexes*2];
			rotor[0][0] = xy[0];
			rotor[1][0] = xy[1];
			for(int i=1; i<4; i++){
				rotor[0][i] = Main.Roter(rotor[0][i-1], original_apexes);
				rotor[1][i] = Main.Roter(rotor[1][i-1], original_apexes);
			}

			for(int i=0; i<data; i++){
				int apexes = sc.nextInt();
				int[] polygonal_Line = new int[original_apexes*2];
				translation[0] = sc.nextInt();
				translation[1] = sc.nextInt();

				for(int j=1; j<apexes; j++){
					polygonal_Line[j*2] = sc.nextInt();
					polygonal_Line[j*2+1] = sc.nextInt();
					polygonal_Line[j*2] -= translation[0];
					polygonal_Line[j*2+1] -= translation[1];
				}

				for(int j=0; j<4; j++){
					if(Arrays.equals(polygonal_Line, rotor[0][j])||Arrays.equals(polygonal_Line, rotor[1][j])){
						System.out.println(i+1);
					}
				}
			}
			System.out.println("+++++");
		}
	}

	static int[] Roter(int[] xy,int original_apexes){
		int[] rotor_90deg = new int[original_apexes*2];

		for(int i=0; i<original_apexes; i++){
			rotor_90deg[i*2] = xy[i*2+1];
			rotor_90deg[i*2+1] = xy[i*2] * -1;
		}
		return rotor_90deg;
	}
}