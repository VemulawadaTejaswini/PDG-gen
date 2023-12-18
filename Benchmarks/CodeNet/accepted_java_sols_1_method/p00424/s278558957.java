import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while (number != 0) {
			
			String convertionTable[][] = new String [number][2];
			
			for (int i = 0; i < number; i++) {
				convertionTable[i][0] = sc.next();
				convertionTable[i][1] = sc.next();
				//System.out.println(convertionTable[i][0] + " " + convertionTable[i][1]);
			}
			
			int dataNumber = sc.nextInt();
			String data[] = new String [dataNumber];
			for (int i = 0; i < dataNumber; i++) {
				data[i] = sc.next();
				for (int j = 0; j < number; j++) {
					if (data[i].equals(convertionTable[j][0])) {
						//System.out.println(data[i] + " " + convertionTable[j][1]);
						data[i] = convertionTable[j][1];
						break;
					}
				}
			}
			
			for (int p = 0; p < dataNumber; p++) {
				System.out.print(data[p]);
			}
			System.out.println();
			number = sc.nextInt();
		}
	}

}