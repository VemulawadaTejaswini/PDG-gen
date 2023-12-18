import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		ArrayList<Integer> listX = new ArrayList<>();
		ArrayList<Integer> listY = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			listX.add(Integer.parseInt(sc.next()));
		}
		for(int i = 0; i < M; i++) {
			listY.add(Integer.parseInt(sc.next()));
		}

		sc.close();
		Collections.sort(listX, Collections.reverseOrder());
		Collections.sort(listY);

		boolean check = false;
		if(X >= Y) {
			System.out.println("War");
			return;
		}else {
			for(int i = X + 1; i <= Y; i++) {
				if(listX.get(0) < i & i <= listY.get(0)) {
					check = true;
					break;
				}else {
					continue;
				}
			}
		}
		if(check) {
			System.out.println("No War");
		}else {
			System.out.println("War");
		}

	}

}