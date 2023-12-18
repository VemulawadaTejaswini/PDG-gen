import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int count = 0;
		int[] ans = new int[6];
		int[] pasta = new int[3];
		int[] juice = new int[2];
		
		for(int r = 0; r < 3; r++) {
			pasta[r] = stdIn.nextInt();
		}
		for(int r = 0; r < 2; r++) {
			juice[r] = stdIn.nextInt();
		}
		
		for(int r = 0; r < pasta.length; r++) {
			for(int c = 0; c < juice.length; c++) {
				ans[count++] = pasta[r] + juice[c] - 50;
			}
		}
		int min = ans[0];
		for(int r = 1; r < ans.length; r++) {
			if(ans[r] < min) min = ans[r];
		}
		System.out.println(min);
		
	}

}