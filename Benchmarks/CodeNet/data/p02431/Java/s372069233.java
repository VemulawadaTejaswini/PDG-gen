import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int count = stdIn.nextInt();
		List<Integer> l = new ArrayList<>();

		for(int i = 0; i < count; i++){
			int command = stdIn.nextInt();

			switch(command){
				case 0:
					l.add(stdIn.nextInt());
					break;

				case 1:
					System.out.println(l.get(stdIn.nextInt()));
					break;

				case 2:
					l.remove(l.size() - 1);
					break;
			}

		}

		stdIn.close();
	}
}
