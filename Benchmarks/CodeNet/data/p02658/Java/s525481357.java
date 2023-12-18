import java.util.*;

public class Main {
	public static void main(String[] args) {
		long kakeru = 1;
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		for (int i = 0; i < first; i++){
			kakeru = kakeru * sc.nextLong();
		}
		if (kakeru > 1000000000000000000L){
			kakeru = -1;
		}
		System.out.println(kakeru);
	}
}