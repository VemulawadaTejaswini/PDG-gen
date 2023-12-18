import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intSize = scan.nextInt();
		int intMin = 0;
		int intMax = 0;
		long longSum = 0;
		int intTemp = 0;
		for(int i = 0; i < intSize; i++){
			intTemp = scan.nextInt();
			longSum += intTemp;
			if(intMin == 0){
				intMin = intTemp;
				intMax = intTemp;
			}
			if(intMax < intTemp){
				intMax = intTemp;
			}
			if(intTemp < intMin){
				intMin = intTemp;
			}
		}
		scan.close();
		System.out.println(intMin + " " + intMax + " " + longSum);
	}
}