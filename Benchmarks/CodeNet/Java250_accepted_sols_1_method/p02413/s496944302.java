import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		Scanner scane = new Scanner(System.in);

		int r = 0, c = 0;

		r = scane.nextInt();
		c = scane.nextInt();

		int[][] rc = new int[r][c];

		int[] r1 = new int[r];
		int[] c1 = new int[c];

		for(int i=0; i<rc.length; i++){
			for(int j=0; j<rc[0].length; j++){

				rc[i][j] = scane.nextInt();
			}
		}
		int nums =0;

		for(int i=0; i<rc.length; i++){
			for(int j=0; j<rc[0].length; j++){

				r1[i] += rc[i][j];
			}
		}
		for(int i=0; i<rc[0].length; i++){
			for(int j=0; j<rc.length; j++){

				c1[i] += rc[j][i];
			}
			nums += c1[i];
		}


		for(int i=0; i<rc.length; i++){
			for(int j=0; j<rc[0].length; j++){

				System.out.print(rc[i][j]+" ");
			}
			System.out.println(r1[i]+"");
		}
		for(int num : c1){
			System.out.print(num+" ");
		}
		System.out.print(nums+"\n");

	}
}