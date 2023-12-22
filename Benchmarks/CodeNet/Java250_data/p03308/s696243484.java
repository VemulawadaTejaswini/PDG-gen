import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());

		ArrayList<Integer> aArrayList = new ArrayList<>();

		for (int i=0; i<N; i++){
			aArrayList.add(Integer.parseInt(sc.next()));
		}

		Collections.sort(aArrayList);

		System.out.println(Math.abs(aArrayList.get(0) - aArrayList.get(aArrayList.size()-1)));
	}
}
