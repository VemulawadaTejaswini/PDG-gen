import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];

		String str = sc.nextLine();
		String[] strs = str.split(" ");

		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(strs[i]);
		}

        int W = input[0];
        int H = input[1];
        int x = input[2];
        int y = input[3];
        int r = input[4];
        sc.close();

        int up = y + r;
        int ri = x + r;
        int le = x - r;
        int dw = y - r;

        if ( up <= H && ri <= W && le >= 0 && dw >= 0) {
        				System.out.println("Yes");
        }else {
        	System.out.println("No");
        }



	}

}
