import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String length = sc.nextLine();
		List<String> getNumsStr = Arrays.asList(sc.nextLine().split(" "));
		List<Integer> getNumsInt = new ArrayList<Integer>();

		for(String num: getNumsStr) {
			getNumsInt.add(Integer.parseInt(num));
		}

		int resultCount = 0;

		for(int i = 0; i < getNumsInt.size(); i++) {
            if((i % 2 == 1) && (getNumsInt.get(i) % 2 == 1)) {
            	resultCount++;
            }
		}
      
      System.out.println(resultCount);
	}
}