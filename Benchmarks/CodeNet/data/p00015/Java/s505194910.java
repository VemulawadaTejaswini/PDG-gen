import java.io.IOException;
import java.util.Scanner;

class Main {
	public String conbineBigNumbers(String strA, String strB){
		int lengthA = strA.length();
		int lengthB = strB.length();

		int numPartitionA = (int)Math.ceil(lengthA/9.0);
		int numPartitionB = (int)Math.ceil(lengthB/9.0);

		int carryOver = 0;
		String strSum = "";

		for(int partNo = 0; partNo < Math.max(numPartitionA, numPartitionB); partNo++){
			int aParts;
			int bParts;

			if(partNo >= numPartitionA){
				aParts = 0;
			} else {
				aParts = Integer.parseInt(strA.substring(Math.max(0, lengthA - 9 * (partNo + 1)), lengthA - 9 * partNo));
			}

			if(partNo >= numPartitionB){
				bParts = 0;
			} else {
				bParts = Integer.parseInt(strB.substring(Math.max(0, lengthB - 9 * (partNo + 1)), lengthB - 9 * partNo));
			}

			String newParts = String.valueOf((aParts + bParts + carryOver) % 1000000000);

			int newPartsLength = newParts.length();
			if(newPartsLength < 9){
				for(int i = 0; i < 9 - newPartsLength; i++)
					newParts = 0 + newParts;
			}
			strSum = newParts + strSum;

			carryOver = (aParts + bParts + carryOver) / 1000000000;
		}

		strSum = carryOver + strSum;
		strSum = strSum.replaceFirst("^0*", "");
		return strSum;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int numSet = Integer.parseInt(input.nextLine());
		for(int iSet = 0; iSet < numSet; iSet++){
			String strA = input.nextLine();
			String strB = input.nextLine();

			if(strA.length() > 80 || strB.length() > 80){
				System.out.println("overflow");
			} else {
				Main nationalBudget = new Main();
				String sum = nationalBudget.conbineBigNumbers(strA, strB);

				if(sum.length() > 80){
					System.out.println("overflow");
				} else {
					System.out.println(sum);
				}
			}
		}
	}
}