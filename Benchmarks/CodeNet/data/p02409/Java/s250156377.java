import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int b, f, r, v;
		int[][][] info = new int[4][3][10];
		for(int i = 0; i < size; i++){
			 b = sc.nextInt() - 1;
			 f = sc.nextInt() - 1;
			 r = sc.nextInt() - 1 ;
			 v = sc.nextInt();
			 info[b][f][r] = v;
		}
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 10; k++){
					System.out.print(" ");
					System.out.print(info[i][j][k]);
				}
				System.out.println("");
			}
			if(i < 3)
				System.out.println("####################");
		}
	}
}