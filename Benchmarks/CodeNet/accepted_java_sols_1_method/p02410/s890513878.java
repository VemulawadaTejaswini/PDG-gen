import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int gyo = sc.nextInt();
		int retu = sc.nextInt();
		//      int gyo = Integer.parseInt(args[0]);
		//      int retu = Integer.parseInt(args[1]);

		int[][] vec_1 = new int[gyo][retu];

		//int[] output = new[vec_1];
		//vec_1
		for (int i = 0; i < gyo; i++) {
			for (int j = 0; j < retu; j++) {
				vec_1[i][j] = sc.nextInt();
				//      vec_1[i][j] = Integer.parseInt(args[4*i+(j+2)]);
				//      System.out.print(vec_1[i][j]+" ");
			}
			//  System.out.println("");
		}

		//vec_2
		int[] vec_2 = new int[retu];
		for (int i = 0; i < retu; i++) {
			vec_2[i] = sc.nextInt();
			//  vec_2[i] = Integer.parseInt(args[gyo*retu+2+i]);
			//  System.out.println(vec_2[i]);
		}

		//output
		int[] output = new int[gyo];
		for (int i = 0; i < gyo; i++) {
			for (int j = 0; j < retu; j++) {
				output[i] = output[i] + vec_1[i][j] * vec_2[j];
			}
			System.out.println(output[i]);
		}

	}

}

