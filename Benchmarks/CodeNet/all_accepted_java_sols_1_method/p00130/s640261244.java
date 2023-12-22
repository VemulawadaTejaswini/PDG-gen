import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		char train[];
		
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			train = new char[2049];
			int strIndex = 0;
			int trainIndex = 1024;
			int maxIndex = 1024;
			int minIndex = 1024;
			while (true) {
				train[trainIndex] = str.charAt(strIndex);
				strIndex += 2;
				if (str.length() < strIndex) {
					break;
				}
				if (str.charAt(strIndex) == '>') {
					trainIndex++;
				} else if (str.charAt(strIndex) == '-') {
					trainIndex--;
				}
				strIndex++;
				if (maxIndex < trainIndex) {
					maxIndex = trainIndex;
				} else if (trainIndex < minIndex) {
					minIndex = trainIndex;
				}
			}
			
			for (int j = minIndex; j <= maxIndex; j++) {
				System.out.print(train[j]);
			}
			System.out.println();
		}
	}
}