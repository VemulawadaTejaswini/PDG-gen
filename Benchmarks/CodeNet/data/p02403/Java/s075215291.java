import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean flg = true;

		ArrayList<Integer> weightList = new ArrayList<Integer>();
		ArrayList<Integer> heightList = new ArrayList<Integer>();

		while (flg) {
			scanner.hasNext();
			int h = scanner.nextInt();
			int w = scanner.nextInt();

			if ((h == 0) && (w == 0)) {
				flg = false;
				break;
			}

			// Integer????????°??????????????????
			weightList.add(Integer.valueOf(w));
			heightList.add(Integer.valueOf(h));
		}

		for(int i=0; i<weightList.size(); i++){

			for(int k = 0; k<heightList.get(i); k++){
				for(int j=0; j<weightList.get(i); j++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}