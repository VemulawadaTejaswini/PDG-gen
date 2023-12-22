import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Integer> lines = new ArrayList<>();
			while(sc.hasNext()) {
				lines.add(Integer.valueOf(sc.nextInt() + sc.nextInt()));
			}
			for (int i = 0; i < lines.size(); i++) {
				System.out.println(String.valueOf(lines.get(i)).length());
			}
		}
	}
}