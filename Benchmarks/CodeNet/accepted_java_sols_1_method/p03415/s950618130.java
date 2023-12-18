import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		String[][] st = new String[3][3];
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<=2; i++){
			String st1 = sc.next();
			for(int j=0; j<=2; j++){
				st[i][j] = String.valueOf(st1.charAt(j));
			}
		}
		System.out.println(st[0][0] + st[1][1] + st[2][2]);
	}
}
