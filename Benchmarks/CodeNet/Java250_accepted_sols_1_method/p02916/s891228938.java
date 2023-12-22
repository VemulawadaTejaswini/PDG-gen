import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dishNumStr = sc.nextLine();
		String eatOrderStr = sc.nextLine();
		String[] eatOrderArray = eatOrderStr.split(" ");
		String firstSatisfactionStr = sc.nextLine();
		String[] firstSatisfactionArray = firstSatisfactionStr.split(" ");
		String secondSatisfactionStr = sc.nextLine();
		String[] secondSatisfactionArray = secondSatisfactionStr.split(" ");
		
		int result = 0;
		for(int i = 0; i < Integer.parseInt(dishNumStr); i++) {
			int eatNum = Integer.parseInt(eatOrderArray[i]);
			result += Integer.parseInt(firstSatisfactionArray[eatNum-1]);
			
			if(i != Integer.parseInt(dishNumStr)-1) {
				int eatNumNext = Integer.parseInt(eatOrderArray[i+1]);
				if(eatNum+1 == eatNumNext) {
					result += Integer.parseInt(secondSatisfactionArray[eatNum-1]);
				}	
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
