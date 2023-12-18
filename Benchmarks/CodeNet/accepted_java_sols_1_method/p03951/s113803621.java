import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = Integer.parseInt(in.nextLine());
		String s = in.nextLine(), t = in.nextLine();
		
		int max = 0;
		for(int i = 0; i < n; i++){
			String ts = s.substring(s.length() - 1 - i, s.length());
			String tt = t.substring(0, i + 1);
			if(ts.equals(tt)){
				max = i + 1;
			}
		}
		System.out.println(n * 2 - max);
	}
}
