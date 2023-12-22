import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List<Integer> train = new ArrayList<>();

		while(stdIn.hasNext()){
			int vehicle = stdIn.nextInt();

			switch(vehicle){
				case 0:
                    System.out.println(train.get(train.size() - 1));
					train.remove(train.size() - 1);
					break;

				default:
					train.add(vehicle);
					break;
					
			}

		}

		stdIn.close();
	}
}
