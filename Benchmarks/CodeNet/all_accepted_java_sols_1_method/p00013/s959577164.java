import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			List<Integer> carNumbers = new ArrayList<Integer>();
			while (sc.hasNextInt()) {
				int carNumber =sc.nextInt();
				if(carNumber!=0){
					carNumbers.add(carNumber);
				}else{
					System.out.println(carNumbers.get(carNumbers.size()-1));
					carNumbers.remove(carNumbers.size()-1);
				}
			}
		} finally {
			sc.close();
		}
	}
}