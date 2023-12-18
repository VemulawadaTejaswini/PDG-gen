import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int[][]a = new int[10][10];
			String str = cin.next();
			for(int i = 0; i < 10; i++){
				a[0][i] = Integer.parseInt(str.substring(i, i+1));
			}
			int count=9;
			for(int i = 1; i < 10; i++){
				for(int j = 0; j < count; j++){
					a[i][j] = (a[i-1][j]+a[i-1][j+1])%10;
				}
			}
			System.out.println(a[9][0]);
		}
	}

}