import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N =  reader.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < N; i++) {
			set.add(reader.nextInt());
		}

		System.out.println(set.size());
		reader.close();
	}


}



