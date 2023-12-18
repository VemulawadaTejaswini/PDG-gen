import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);

		String[] dataStr = sc.nextLine().split(" ");

		int[] data = new int[dataStr.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt( dataStr[i] );
		}

		int W = data[0], H = data[1], x = data[2], y = data[3], r = data[4];

		if ( 0<=x-r && x+r<=W  && 0<=y-r && y+r<=H )
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}