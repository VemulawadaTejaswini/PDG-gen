import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numH = in.nextInt();
		int numW = in.nextInt();
		int numh = in.nextInt();
		int numw = in.nextInt();
		
		int ans = (numH - numh) * (numW -numw);
		
			System.out.println(ans);
		
		in.close();
	}

}
