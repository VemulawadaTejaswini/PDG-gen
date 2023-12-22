import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<Integer,Integer> students = new LinkedHashMap<>();
		for(int i = 0; i < n; i++) {
			students.put(sc.nextInt(),i);
		}
		for(int i = 1; i <= n; i++) {
			System.out.print(students.get(i)+1+ " ");
		}


	}

}