
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//waste of space, but I like arrays.
		int[][] myIndex = new int[5000][5000];

		//Get the number of time this needs to be done
		int q = sc.nextInt();

		for (int k = 0; k < q; k++) {
			//This for loop is just to get the values for the every comparison
			String a = sc.next();
			String b= sc.next();
			for (int i = 0; i < a.length(); ++i) { //First Position For Loop
				for (int j = 0; j < b.length(); ++j) { //Second Position For Loop

					//Checks if chars are the same
					if (a.charAt(i) == b.charAt(j)) {
						myIndex[i + 1][j + 1] = myIndex[i][j] + 1;
					}

					else {
						//checking which spot it needs to go in.
						if (myIndex[i + 1][j] > myIndex[i][j + 1]) {
							myIndex[i + 1][j + 1] = myIndex[i + 1][j];

						}

						else {

							myIndex[i + 1][j + 1] = myIndex[i][j + 1];
						}
					}
				}
			}
			//Prints out the entire array that is defined on new linges
			System.out.printf("%d\n", myIndex[a.length()][b.length()]);
		}
	}
}
