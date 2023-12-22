import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int ans = Integer.MAX_VALUE;
		
		for (int i = 0; i < s.length() - 2; i++){
			ans = Math.min(Math.abs((Integer.parseInt(s.substring(i, i + 3))) - 753), ans);
		}
		
		System.out.println(ans);

	}

}