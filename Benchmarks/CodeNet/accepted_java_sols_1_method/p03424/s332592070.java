import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		for (int i=0; i<N; i++){
			String s = sc.next();
			if (s.equals("Y")){
				System.out.println("Four");
				return;
			}
		}
		System.out.println("Three");
		return;
	}
}
