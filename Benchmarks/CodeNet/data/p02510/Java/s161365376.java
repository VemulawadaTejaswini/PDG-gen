import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		int m;
		int h;

		while (true){
			s = sc.next();
			if (s.equals("-")){
				break;
			}

			m = sc.nextInt();

			for (int i = 0; i < m; i++){
				h = sc.nextInt();
				s = shuffle(s, h);
			}

			System.out.println(s);
		}
	}

	public static String shuffle(String s, int h){
		if (h < 1 || h >= s.length()){
			return s;
		}
		return s.substring(h, s.length()) + s.substring(0, h);
	}

}