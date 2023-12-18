import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String[] str = new String[9];
		int[][] a = new int[2][9];
		int[][] sum = new int[2][9];
		for(int i = 0; i < 9; i++){
			str[i] = cin.next();
			a[0][i]=cin.nextInt();
			a[1][i]=cin.nextInt();
			sum[0][i]=a[0][i] + a[1][i];
			sum[1][i]=a[0][i]*200 + a[1][i]*300;
		}
		int cnt=0;
		for(int i = 1; i < 4;i++){
			for(int j = 0; j < 3;j++){
				System.out.print(str[cnt]+" ");
				System.out.println(sum[0][cnt] + " " + sum[1][cnt++]);
			}
		}
	}

}