import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intLoop = scan.nextInt();
		ArrayList<Double> list = new ArrayList<Double>();
		ArrayList<Integer> listX = new ArrayList<Integer>();
		ArrayList<Integer> listY = new ArrayList<Integer>();
		for(int i = 0; i < intLoop; i++){
			listX.add(scan.nextInt());
		}
		for(int i = 0; i < intLoop; i++){
			listY.add(scan.nextInt());
		}
		// P = 1
		double dbP1 = 0;
		for(int i = 0; i < intLoop; i++){
			dbP1 += Math.abs((listX.get(i) - listY.get(i)));
		}
		list.add(dbP1);

		// P = 2
		double dbP2 = 0;
		for(int i = 0; i < intLoop; i++){
			dbP2 += Math.pow(Math.abs((listX.get(i) - listY.get(i))), 2);
		}
		list.add(Math.sqrt(dbP2));

		// P = 3
		double dbP3 = 0;
		for(int i = 0; i < intLoop; i++){
			dbP3 += Math.pow(Math.abs((listX.get(i) - listY.get(i))), 3);
		}
		list.add(Math.cbrt(dbP3));

		// P = ???
		double dbInf = 0;
		double dbTemp = 0;
		for(int i = 0; i < intLoop; i++){
			dbTemp = Math.abs(listX.get(i) - listY.get(i));
			if(dbInf <= dbTemp){
				dbInf = dbTemp;
			}
		}
		list.add(dbInf);

		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}