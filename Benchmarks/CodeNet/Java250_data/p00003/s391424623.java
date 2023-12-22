

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {

		// get user input
		List<List<Integer>> userInputs = getUserInputs();
		for (List<Integer> triangleSides : userInputs) {
			// check whether triagle is rightAngleTriable or not
			boolean isRightAngleTrangle = isRightAngleTraingle(triangleSides);
			if (isRightAngleTrangle) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}


	private static boolean isRightAngleTraingle(List<Integer> intList) {
		if(intList == null || intList.isEmpty() || intList.size() != 3){
			return false;
		}
		Collections.sort(intList);
		
		int aSide = intList.get(0);
		int bSide = intList.get(1);
		int cSide = intList.get(2);
		if ((cSide * cSide) == ((aSide * aSide) + (bSide * bSide))) {
			return true;
		}
		return false;
	}

	
	private static List<List<Integer>> getUserInputs() {
		int repetation = 0;
		List<List<Integer>> returnList = new ArrayList<>();

		// get user input
		List<String> userList = new ArrayList<String>();
		{
			Scanner in = new Scanner(System.in);
			String sNum = in.nextLine();
			repetation = Integer.parseInt(sNum);
			
			for (int i = 0; i < repetation; i++) {
				userList.add(in.nextLine());
			}
		}
		// convert string into Integer
		{

			for (String input : userList) {
				input = input.trim();
				if(input.length() == 0){
					continue;
				}
				String array[] = input.split("\\s+");
				ArrayList<Integer> intList = new ArrayList<Integer>();
				for (int i = 0; i < array.length; i++) {
					String num = array[i];					
					intList.add(Integer.parseInt(num.trim()));
				}
				returnList.add(intList);
			}
		}
		return returnList;
	}

}