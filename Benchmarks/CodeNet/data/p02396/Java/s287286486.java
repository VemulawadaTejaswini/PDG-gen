import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//split??????????????§????????????????§£????????£??\
		ArrayList<Integer> numList = new ArrayList();
		while (sc.hasNextLine()) {
			numList.add(Integer.parseInt(sc.nextLine()));
		}
		for(int i = 0;i < numList.size();i++) {
			System.out.println("Case " + (i + 1) + ": " + numList.get(i));
		}
		sc.close();


	}
}