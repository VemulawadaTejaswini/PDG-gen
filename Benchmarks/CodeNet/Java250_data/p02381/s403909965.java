import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intLoop = scan.nextInt();
		double dbAve = 0;
		int intTemp = 0;
		double dbVariance = 0;
		double dbDeviation = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Double> devList = new ArrayList<Double>();
		while (intLoop != 0) {
			dbAve = 0;
			intTemp = 0;
			dbVariance = 0;
			dbDeviation = 0;
			list = new ArrayList<Integer>();
			for (int i = 0; i < intLoop; i++) {
				intTemp = scan.nextInt();
				list.add(intTemp);
				dbAve += intTemp;
			}
			dbAve = dbAve / intLoop;
			for (int i = 0; i < intLoop; i++) {
				dbVariance += Math.pow(list.get(i) - dbAve, 2);
			}
			dbVariance /= intLoop;
			dbDeviation = Math.sqrt(dbVariance);
			devList.add(dbDeviation);
			intLoop = scan.nextInt();
		}
		for(int i = 0; i < devList.size(); i++){
			System.out.println(devList.get(i));
		}
	}
}