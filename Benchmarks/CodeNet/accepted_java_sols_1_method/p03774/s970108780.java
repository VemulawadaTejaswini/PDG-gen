import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		ArrayList<Integer> studentX = new ArrayList<>();
		ArrayList<Integer> studentY = new ArrayList<>();
		ArrayList<Integer> checkPointX = new ArrayList<>();
		ArrayList<Integer> checkPointY = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			studentX.add(Integer.parseInt(sc.next()));
			studentY.add(Integer.parseInt(sc.next()));
		}
		for(int i = 0; i < M; i++) {
			checkPointX.add(Integer.parseInt(sc.next()));
			checkPointY.add(Integer.parseInt(sc.next()));
		}
		sc.close();


		for(int i = 0; i < N; i++) {
			int distance = Integer.MAX_VALUE;
			int ans = 0;
			for(int j = 0; j < M; j++) {
				int tmpX = Math.abs(studentX.get(i) - checkPointX.get(j));
				int tmpY = Math.abs(studentY.get(i) - checkPointY.get(j));
				if(distance > tmpX + tmpY) {
					distance = tmpX + tmpY;
					ans = j + 1;
				}else {
					continue;
				}
			}
			System.out.println(ans);
		}
	}

}