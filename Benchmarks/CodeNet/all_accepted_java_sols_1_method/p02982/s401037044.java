import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), d = scan.nextInt();
		float[][] array = new float[n][d];
		float root_inside;
		int count=0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < d; j++) {
				array[i][j] = scan.nextInt();
			}
		for (int i_kari = 0; i_kari < n - 1; i_kari++) {

			for (int i = i_kari + 1; i < n; i++) {
				root_inside = 0;
				for (int j = 0; j < d; j++) {
					root_inside += Math.pow((array[i_kari][j] - array[i][j]), 2);
				}
				if(Math.ceil(Math.sqrt(root_inside))-Math.floor(Math.sqrt(root_inside))==0){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}